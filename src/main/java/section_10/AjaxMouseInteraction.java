package section_10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AjaxMouseInteraction {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://www.autodoc.de/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Deutsch']"))).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("button_type"))).click();
        action(driver,actions);
        actionTwo(driver,actions);
    }

    public static void action(WebDriver driver, Actions actions){
        WebElement cart = driver.findElement(By.className("header-cart"));
        actions.moveToElement(cart).build().perform();
        System.out.println("Get text: " + driver.findElement(By.className("header-cart__tooltip-empty")).getText());
    }

    public static void actionTwo (WebDriver driver, Actions actions){
        WebElement searchField = driver.findElement(By.cssSelector("[name='keyword']"));
        searchField.sendKeys("n501".toUpperCase());
        searchField.clear();
        actions.moveToElement(searchField).click().keyDown(Keys.SHIFT)
                .sendKeys("n501").build().perform();
        actions.moveToElement(searchField).doubleClick().click().keyDown(Keys.BACK_SPACE).perform();
        actions.keyUp(Keys.SHIFT).perform();
        searchField.sendKeys("N501".toLowerCase());
        actions.click().perform();
        actions.moveToElement(searchField).contextClick().perform();
    }
}
