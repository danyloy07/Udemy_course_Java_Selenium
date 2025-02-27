package section_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebSite {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.autodoc.de/");
        System.out.println(webDriver.getTitle());
        System.out.println(webDriver.getCurrentUrl());
        webDriver.quit(); // закрывает все смежные  вкладки
        webDriver.close(); // закрывает только активную вкладку
    }
}
