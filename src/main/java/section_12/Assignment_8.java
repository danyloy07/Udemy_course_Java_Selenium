package section_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Assignment_8 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.xpath("//table[@name='courses']//tr")).size());
        System.out.println(driver.findElements(By.xpath("//table[@name='courses']//th")).size());

        WebElement dd = driver.findElements(By.xpath("//table[@name='courses']//tr")).get(3);
        System.out.println(dd.findElements(By.tagName("td")).get(0).getText());
        System.out.println(dd.findElements(By.tagName("td")).get(1).getText());
        System.out.println(dd.findElements(By.tagName("td")).get(2).getText());
    }
}
