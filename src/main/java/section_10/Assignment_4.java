package section_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Assignment_4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
        windowsHandle(driver);
        driver.quit();
    }

    public static void windowsHandle(WebDriver driver){
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> id = windows.iterator();
        String firsTab = id.next();
        String secondTab = id.next();
        driver.switchTo().window(secondTab);
        System.out.println("Child page text: " + driver.findElement(By.xpath("//h3")).getText());
        driver.switchTo().window(firsTab);
        System.out.println("Parent page text: " + driver.findElement(By.xpath("//h3")).getText());
    }
}
