package section_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class End2EndTestWithWaits {

    public static WebDriver driver = new ChromeDriver() ;

    public static void main(String[] args) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        //String [] phones = {"iphone", "Samsung", "Nokia", "Blackberry"};
        loginPage(wait);
        addProducts(wait);
        driver.quit();
    }

    public static void loginPage(WebDriverWait wait){
        String login = driver.findElement(By.xpath("//b[1]")).getText();
        String password = driver.findElement(By.xpath("//b[2]")).getText();
        Select select = new Select(driver.findElement(By.xpath("//select[@data-style='btn-info']")));

        driver.findElement(By.id("username")).sendKeys(login);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='user']/following-sibling::span")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn"))).click();
        select.selectByValue("consult");
        driver.findElement(By.name("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
    }

    public static void addProducts(WebDriverWait wait){
        Assert.assertEquals(wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h1[@class='my-4']"))).getText(), "Shop Name");
        List<WebElement> buttonAdd = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
        for (int i = 0; i < buttonAdd.size(); i++) {
            buttonAdd.get(i).click();
        }
        driver.findElement(By.xpath("//a[contains(@class, 'nav-link btn')]")).click();
        Assert.assertEquals(wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h3[text()='Total']"))).getText(), "Total");
    }
}