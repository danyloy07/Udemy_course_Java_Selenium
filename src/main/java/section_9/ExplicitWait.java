package section_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        String[] products = {"Capsicum", "Raspberry", "Mango"};
        addItems(driver,products);
        processToCart(driver,wait);
        //driver.quit();

    }
    public static void addItems(WebDriver driver,String[] products){
        int j = 0;
        List<WebElement> listOfProducts = driver.findElements(By.xpath("//h4[@class='product-name']"));
        for (int i = 0;i<listOfProducts.size(); i++){
            String[] getProducts = listOfProducts.get(i).getText().split("-");
            String correctName = getProducts[0].trim();
            List itemsNeededList = Arrays.asList(products);
            if (itemsNeededList.contains(correctName)){
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if(j==products.length){
                    break;
                }
            }
        }
    }
    public static void processToCart(WebDriver driver, WebDriverWait wait){
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']"))).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[text()='Apply']")).click();
        System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo"))).getText());
        Assert.assertEquals(driver.findElement(By.cssSelector("span.promoInfo")).getText(), "Code applied ..!");

    }
}

