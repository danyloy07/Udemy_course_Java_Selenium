package section_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.easyjet.com/pl");
        Thread.sleep(2000);
        driver.findElement(By.id("ensCloseBanner")).click();
        driver.findElement(By.id("who")).click();
        Thread.sleep(1000);
        for (int i = 1; i < 6; i++) {
            driver.findElement(By.xpath("//button[@aria-label='Dodaj 1 dorosły']")).click();
        }
         /* int i=1
            while(i<5){
             driver.findElement(By.id("hrefIncAdt")).click();
             i++
             }
         */
        driver.findElement(By.xpath("//button[@data-testid='close-button']")).click();



    }
}
