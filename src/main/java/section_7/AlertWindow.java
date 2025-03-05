package section_7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertWindow {
   public static WebDriver  driver = new ChromeDriver();
    public static WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public static void main(String[] args) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();


        WebElement timerButton = driver.findElement(By.id("timerAlertButton"));
        webDriverWait.until(ExpectedConditions.visibilityOf(timerButton)).click();
        webDriverWait.until(ExpectedConditions.alertIsPresent()).accept();
        //driver.switchTo().alert().accept();

        //scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500);");

        driver.findElement(By.id("confirmButton")).click();
        webDriverWait.until(ExpectedConditions.alertIsPresent()).dismiss();
        //driver.switchTo().alert().dismiss();
        System.out.println(driver.findElement(By.id("confirmResult")).getText());


        driver.findElement(By.id("promtButton")).click();
        driver.switchTo().alert().sendKeys("Hello test");
        driver.switchTo().alert().accept();

        System.out.println(driver.findElement(By.id("promptResult")).getText());

        driver.close();
    }
}
