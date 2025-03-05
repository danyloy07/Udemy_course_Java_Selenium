package section_7;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggestiveDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("in");
        Thread.sleep(1000);
        List<WebElement> webElementList = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
        for (WebElement webElement: webElementList){
            // equalsIgnoreCase(String anotherString) – это метод Java, который сравнивает две строки без учёта регистра.
            if (webElement.getText().equalsIgnoreCase("India")) {
                webElement.click();
                break;
            }
        }
        //for (int i = 0; i < webElementList.size(); i++) {
        //    WebElement webElement = webElementList.get(i);
        //    if (webElement.getText().equalsIgnoreCase("India")) {
        //        webElement.click();
        //        break;
        //    }
        //}
    }
}
