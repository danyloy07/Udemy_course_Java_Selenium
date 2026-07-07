package back_to_course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class RepeatSection7 {
    public static WebDriver driver = new ChromeDriver();
    public static WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(5));

    //Напишите Selenium-скрипт, который открывает страницу AutomationPractice и проверяет работу чекбоксов.
    // Скрипт должен выбрать первый чекбокс, убедиться, что он стал выбранным, затем снять выбор и убедиться, что чекбокс
    // больше не выбран. После этого необходимо определить общее количество чекбоксов на странице и проверить, что их ровно
    // три.
    public static void repeatAss1() {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        WebElement checkbox1 = driver.findElement(By.cssSelector("#checkBoxOption1"));
        checkbox1.click();
        Assert.assertTrue(checkbox1.isSelected());
        checkbox1.click();
        Assert.assertFalse(checkbox1.isSelected());
        int countOfCheckbox = driver.findElements(By.xpath("//div[@id='checkbox-example']//label")).size();
        Assert.assertEquals(countOfCheckbox, 3);
        driver.quit();
    }

    //Напишите Selenium-скрипт для заполнения учебной формы на странице angularpractice. Скрипт должен заполнить
    // основные поля формы: имя, email, пароль и дату рождения, выбрать чекбокс, выбрать значение из выпадающего списка
    // пола, выбрать radio button и отправить форму. После отправки формы необходимо получить сообщение об успешной
    // отправке и вывести его в консоль.
    public static void repeatAss2() {
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='form-group']/input[@name='name']")).sendKeys("Danil");
        driver.findElement(By.xpath("//div[@class='form-group']/input[@name='email']")).sendKeys("Test");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
        WebElement checkbox = driver.findElement(By.cssSelector("#exampleCheck1"));
        checkbox.click();
        Assert.assertTrue(checkbox.isSelected());
        Select select = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
        select.selectByVisibleText("Male");
        driver.findElement(By.cssSelector("input[value='option2']")).click();
        driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("20.09.2001");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        System.out.println(driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert"))).getText());
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        repeatAss1();
        repeatAss2();
    }
}
