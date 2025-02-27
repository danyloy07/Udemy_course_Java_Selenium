package section_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPassword {
    public String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.xpath("//*[contains(text(), 'Forgot your')] ")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Danylo");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Danylo@mail.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("55552522525");
        driver.findElement(By.className("reset-pwd-btn")).click();
        String getPass= driver.findElement(By.cssSelector("form p")).getText();
        String[] splitPass = getPass.split("'");
        // Please use temporary password 'rahulshettyacademy' to Login.
        //0 index - Please use temporary password '
        //1 index - rahulshettyacademy' to Login.
        String password = splitPass[1].split("'")[0];
        return password;

    }
}
