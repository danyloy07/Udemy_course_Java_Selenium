package section_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Exercise_2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.xpath("//label[text()='Name']/following-sibling::input")).sendKeys("Danylo");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hellotest@mail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test123");
        WebElement checkbox = driver.findElement(By.id("exampleCheck1"));
        checkbox.click();
        Assert.assertTrue(checkbox.isEnabled());
        Select dropdown = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
        dropdown.selectByContainsVisibleText("Male");
        WebElement radioButton = driver.findElement(By.id("inlineRadio2"));
        radioButton.click();
        Assert.assertTrue(radioButton.isSelected());
        driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("20.09.2001");
        driver.findElement(By.xpath("//input[contains(@class,'success')]")).click();
        System.out.println(driver.findElement(By.xpath("//div[contains(@class,'alert-success')]")).getText());
        driver.quit();
    }
}
