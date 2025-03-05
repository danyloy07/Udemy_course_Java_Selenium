package section_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement checkbox = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
        Assert.assertFalse(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        Assert.assertTrue(checkbox.isSelected());
        //Count of the number of checkboxes
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

    }
}
