package section_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        String name = "Danylo";
        WebDriver webDriver1 = new ChromeDriver();
        webDriver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String password = new DynamicPassword().getPassword(webDriver1);
        webDriver1.get("https://rahulshettyacademy.com/locatorspractice/");
        webDriver1.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys(name);
        webDriver1.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys(password);
        webDriver1.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
        webDriver1.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
        System.out.println(webDriver1.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText());
        Assert.assertEquals(webDriver1.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText(),"You are successfully logged in.");
        Assert.assertEquals(webDriver1.findElement(By.xpath("//div[@class='login-container']/h2")).getText(),"Hello " + name + ",");
        webDriver1.findElement(By.xpath("//*[text()='Log Out']")).click();
        Assert.assertEquals(webDriver1.findElement(By.xpath("//h1[contains(text(), 'Sign')]")).getText(),"Sign in");
        webDriver1.close();
    }
}
