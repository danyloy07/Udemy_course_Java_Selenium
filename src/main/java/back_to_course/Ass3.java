package back_to_course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ass3 {
    public static void loginPage (WebDriver driver, WebDriverWait wait) {
        String getUsername = driver.findElement(By.xpath("//b[1]")).getText();
        String getPassword = driver.findElement(By.xpath("//b[2]")).getText();
        driver.findElement(By.id("username")).sendKeys(getUsername);
        driver.findElement(By.id("password")).sendKeys(getPassword);
        driver.findElement(By.xpath("//span[text()=' User']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn"))).click();
        Select select = new Select(driver.findElement(By.xpath("//select")));
        select.selectByValue("consult");
        driver.findElement(By.cssSelector("label[for='terms']")).click();
        driver.findElement(By.cssSelector("#signInBtn")).click();
    }

    public static void addToCart(WebDriver driver,WebDriverWait wait){
    wait.until(ExpectedConditions.urlToBe("https://rahulshettyacademy.com/angularpractice/shop"));
    List<WebElement> products = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
    for (WebElement add:products){
        add.click();
    }
    driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
    Assert.assertEquals(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Total']"))).getText(), "Total");
    }

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--disable-features=PasswordLeakDetection");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage(driver, wait);
        addToCart(driver,wait);
        driver.quit();
    }
}
