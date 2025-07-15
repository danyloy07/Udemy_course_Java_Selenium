package section_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        WebElement checkbox = driver.findElement(By.id("checkBoxOption3"));
        checkbox.click();
        Assert.assertTrue(checkbox.isSelected());
        String grabText = checkbox.getDomAttribute("value");
        Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
        dropdown.selectByValue(grabText);
        driver.findElement(By.id("name")).sendKeys(grabText);
        driver.findElement(By.id("alertbtn")).click();
        String textAllert = driver.switchTo().alert().getText();
        Assert.assertTrue(textAllert.contains(grabText), "Option3");
        driver.switchTo().alert().accept();
        driver.quit();
    }
}
