package section_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Random;

public class XPathLocator {
    public static void main(String[] args) throws InterruptedException {
        //Xpath –
        //	//Tagname[@attribute=’value’]
        // //input[@placeholder=’ Username’’]
        //
        //<input type="text" placeholder="Name">
        // //input[@placeholder=’ Name’]
        //
        //•	//Tagname[@attribute=’value’][index]
        //•	//parentTagname/childTagname
        //•	//button[contains(@class,'submit')].  – Regular expression
        //•	//tagname
        //•	//header/div/button[1]/following-sibling::button[1]
        //•	//header/div/button[1]/parent::div
        WebDriver webDriver1 = new ChromeDriver();
        webDriver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        webDriver1.get("https://rahulshettyacademy.com/locatorspractice/");
        webDriver1.findElement(By.xpath("//input[@id='inputUsername']"))
                .sendKeys("login");
        webDriver1.findElement(By.xpath("//input[@name='inputPassword']"))
                .sendKeys("Pass123");
        webDriver1.findElement(By.xpath("//input[@id='chkboxTwo']"))
                .click();
        webDriver1.findElement(By.xpath("//button[@class='submit signInBtn']"))
                .click();
        webDriver1.findElement(By.xpath("//a[text()='Forgot your password?']")) // по совпадению текста
                .click();
        Thread.sleep(1000);
        webDriver1.findElement(By.xpath("//input[@placeholder='Name']"))
                .sendKeys("Name1");
        webDriver1.findElement(By.xpath("//input[contains(@placeholder, 'Email')]"))
                .sendKeys("test123@mail.com");
        webDriver1.findElement(By.xpath("//input[contains(@placeholder, 'Email')]"))
                .clear();
        webDriver1.findElement(By.xpath("//input[@type='text'][2]"))
                .sendKeys("test321@mail.com");
        webDriver1.findElement(By.xpath("//form/input[3]")) //parent/child[index]
                .sendKeys("0000000000000");
        webDriver1.findElement(By.cssSelector(".reset-pwd-btn")) //
                .click();
        System.out.println("Notification message: " + webDriver1.findElement(By.cssSelector("form p")) // css parent child
                .getText());
        webDriver1.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]"))
                .click();
        Thread.sleep(1000);
        webDriver1.findElement(By.cssSelector("#inputUsername"))
                .sendKeys("Danil");
        webDriver1.findElement(By.cssSelector("input[type*='pass']")).
                sendKeys("rahulshettyacademy");
        webDriver1.findElement(By.xpath("//input[@id='chkboxTwo']"))
                .click();
        webDriver1.findElement(By.xpath("//button[contains(@class,'submit')]"))
                .click();
webDriver1.quit();


    }
}
