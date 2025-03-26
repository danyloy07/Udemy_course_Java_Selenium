package section_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LimitingWebDriver {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        Set <String> abc = driver.getWindowHandles();
        Iterator<String> iterator = abc.iterator();


        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());

        WebElement footer = driver.findElement(By.id("gf-BIG"));
        System.out.println(footer.findElements(By.tagName("a")).size());

        WebElement firstColum = footer.findElement(By.xpath("//td[1]/ul"));
        System.out.println(firstColum.findElements(By.tagName("a")).size());

        List<WebElement> links = firstColum.findElements(By.tagName("a"));
        for (int i = 0; i < links.size(); i++) {
            footer = driver.findElement(By.id("gf-BIG"));
            WebElement firstColumn = footer.findElement(By.xpath("//td[1]/ul"));
            links = firstColumn.findElements(By.tagName("a"));
            links.get(i).click();
            driver.navigate().back();
        }
    }
}
