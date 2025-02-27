package section_6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowManage {
    public static void manageWindow(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        String winID = driver.getWindowHandle();
        System.out.println(driver.findElement(By.xpath("//a[contains(@href, 'rahul')]/following-sibling::button[1]")).getText());
        driver.navigate().back();
        driver.navigate().forward();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://facebook.com");
        String win2Id = driver.getWindowHandle();
        System.out.println(driver.getTitle());
        driver.switchTo().window(winID);
        System.out.println(driver.getTitle());
        driver.switchTo().window(win2Id);
        driver.close();



    }
    public static void main(String[] args) {
    manageWindow();
    }
}
