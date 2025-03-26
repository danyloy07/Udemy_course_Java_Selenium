package section_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public class Assignment_6 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       WebElement checkbox = driver.findElement(By.id("checkBoxOption2"));
       checkbox.click();
       String valueOfCheckbox = checkbox.getDomAttribute("value");

       Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
       select.selectByValue(valueOfCheckbox);

       driver.findElement(By.id("name")).sendKeys(valueOfCheckbox);

       driver.findElement(By.id("alertbtn")).click();
       String textFromAlert = driver.switchTo().alert().getText();
       String[] splittedArray = textFromAlert.split(",");
       String[] finalText = splittedArray[0].split(" ");
       Assert.assertEquals(finalText[1], "option2");
       driver.switchTo().alert().accept();

       driver.quit();


    }
}
