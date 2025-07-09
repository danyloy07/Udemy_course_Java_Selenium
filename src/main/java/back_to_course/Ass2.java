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

public class Ass2 {

    public static void fillInputs(WebDriver driver, WebDriverWait wait){
        WebElement inputName = driver.findElement(By.xpath("//label[text()='Name']/following-sibling::input"));
        wait.until(ExpectedConditions.visibilityOf(inputName)).sendKeys("Test");
       driver.findElement(By.name("email")).sendKeys("test@mail.com");
       driver.findElement(By.id("exampleInputPassword1")).sendKeys("123");
       driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("20.09.2001");
    }

    public static void select(WebDriver driver){
        WebElement checkbox = driver.findElement(By.id("exampleCheck1"));
        checkbox.click();
        Assert.assertTrue(checkbox.isSelected());
        WebElement radioButton = driver.findElement(By.id("inlineRadio1"));
        radioButton.click();
        Assert.assertTrue(radioButton.isSelected());
    }

    public static void dropDowns(WebDriver driver){
        Select select = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
        select.selectByContainsVisibleText("Female");
    }

    public static void submit(WebDriver driver){
        driver.findElement(By.xpath("//input[contains(@class,'success')]")).click();
        System.out.println(driver.findElement(By.xpath("//div[contains(@class,'alert-success')]")).getText());
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        fillInputs(driver, wait);
        select(driver);
        dropDowns(driver);
        submit(driver);
        driver.quit();
    }
}
