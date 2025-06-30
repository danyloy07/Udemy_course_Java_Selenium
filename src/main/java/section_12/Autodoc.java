package section_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class Autodoc {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("autocomplete")).sendKeys("po");
        List<WebElement> county = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
        for (int i = 0; i < county.size(); i++) {
            String nameOfCountry = county.get(i).getText();
            if (nameOfCountry.equalsIgnoreCase("Poland")) {
                actions.moveToElement(county.get(i)).click().build().perform();
            }
        }
    }
}
