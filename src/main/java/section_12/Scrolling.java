package section_12;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.SortedMap;


public class Scrolling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //скролит страницу
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        //скролит вебелемент
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

        List<WebElement> values = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
        int sum = 0;
        for (int i = 0; i < values.size(); i++) {
            Integer.parseInt(values.get(i).getText());
            sum = sum + Integer.parseInt(values.get(i).getText());
        }
        String totalAmount= driver.findElement(By.className("totalAmount")).getText();
        String[] splittedAmount = totalAmount.split(":");
        int amount = Integer.parseInt(splittedAmount[1].trim());

        Assert.assertEquals(sum,amount);

        if (amount==sum){
            System.out.println("Legend");
        }else {
            System.out.println("Try again!");
        }
    }
}
