package section_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorIdName {
    public static void identifyWebElementByIdAndName() {

    //<input type="text" placeholder="Username" id="inputUsername" value="">
    //Input - tag name
    // type, placeholder, id, value - attribute
    // "text", "Username" , "inputUsername" -  attribute accotiated value

        //System.setProperty("webdriver.chrome.driver","C:\\Users\\danyloy\\Documents\\chromedriver-win64\\chromedriver.exe");// тут вызываем chrome driver локально , а не через Selenium manager


    WebDriver webDriver1 = new ChromeDriver();
    webDriver1.get("https://rahulshettyacademy.com/locatorspractice/");
    webDriver1.findElement(By.id("inputUsername"))
            .sendKeys("Danil");
webDriver1.findElement(By.name("inputPassword"))
                .sendKeys("Start123");
webDriver1.findElement(By.id("chkboxTwo"))
                .click();
webDriver1.findElement(By.className("signInBtn"))
                .click();


    //webDriver1.close();
}

    public static void main(String[] args) {
        identifyWebElementByIdAndName();
    }
}
