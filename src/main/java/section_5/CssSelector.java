package section_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CssSelector {
    public static void main(String[] args) {
        //<input type="text" placeholder="Username" id="inputUsername" value="">
        //Class name  -> tagname.classname --> button.signInBtn
        //Id --> tagname#id --> input#inputUserName
        //Tagname[attribute='value'] --> Input[placeholder='Username']

        WebDriver webDriver1 = new ChromeDriver();
        webDriver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        webDriver1.get("https://rahulshettyacademy.com/locatorspractice/");
        webDriver1.findElement(By.id("inputUsername"))
                .sendKeys("Danil");
        webDriver1.findElement(By.name("inputPassword"))
                .sendKeys("Start123");
        webDriver1.findElement(By.id("chkboxTwo"))
                .click();
        webDriver1.findElement(By.className("signInBtn"))
                .click();
        System.out.println(webDriver1.findElement(By.cssSelector("p.error"))
                .getText());
        webDriver1.findElement(By.linkText("Forgot your password?")) //Если тег нейм у нас <a , то тогда єто буддет ссілка
                .click();

    }
}
