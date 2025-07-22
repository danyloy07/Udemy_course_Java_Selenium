package section_11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class ScrollJs {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //scroll
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500);");
        Thread.sleep(2000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        List<WebElement> amount = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
        int sum =0;
        for (int i = 0; i < amount.size(); i++) {
            sum = sum + Integer.parseInt(amount.get(i).getText());
        }
        String totalAmount = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
        String[] totalAmount1 =  totalAmount.split(": ");
        int total = Integer.parseInt(totalAmount1[1].trim());
        Assert.assertEquals(total,sum);
        driver.quit();




    }
}
