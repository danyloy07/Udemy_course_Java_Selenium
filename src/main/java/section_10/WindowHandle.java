package section_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
                driver.findElement(By.className("blinkingText")).click();
                windowHandle(driver);
    }

    public static void windowHandle(WebDriver driver){
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> id = windows.iterator();
        String rahulPage = id.next();
        String emailPage = id.next();
        driver.switchTo().window(emailPage);
        driver.findElement(By.cssSelector(".im-para.red")).getText();
        String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(rahulPage);
        driver.findElement(By.id("username")).sendKeys(email);


    }
}
