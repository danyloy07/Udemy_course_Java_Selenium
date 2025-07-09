package back_to_course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Ass1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
        checkbox1.click();
        Assert.assertTrue(checkbox1.isSelected());
        checkbox1.click();
        Assert.assertFalse(checkbox1.isSelected());

        List<WebElement> countCheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(countCheckbox.size());
        Assert.assertEquals(countCheckbox.size(),3);
        driver.quit();
    }
}
