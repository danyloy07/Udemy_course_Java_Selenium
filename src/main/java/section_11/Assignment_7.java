package section_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Assignment_7 {
    public static WebDriver driver = new ChromeDriver();

    public static void countRows(){
        WebElement table = driver.findElement(By.id("product"));
        System.out.println(table.findElements(By.tagName("tr")).size());
    }

    public static void countColums(){
        System.out.println(driver.findElements(By.xpath("//table[@id='product' and @name='courses']//tr/th")).size());
    }

    public static void secondRaw(){
        //List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
        WebElement value = driver.findElement(By.xpath("//table[@id='product' and @name='courses']//tr[3]"));
        List <WebElement> secondRow= value.findElements(By.tagName("td"));
        System.out.println(secondRow.get(0).getText());
        System.out.println(secondRow.get(1).getText());
        System.out.println(secondRow.get(2).getText());
    }

    public static void main(String[] args) {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        countRows();
        countColums();
        secondRaw();

    }
}
