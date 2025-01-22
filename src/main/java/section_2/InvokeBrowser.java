package section_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\danyloy\\Documents\\chromedriver-win64\\chromedriver.exe");// тут вызываем chrome driver локально , а не через Selenium manager

        //ChromeDriver chromeDriver = new ChromeDriver(); - обьект драйвера здесь имеет доступ ко всем методам драйвера Chrome
        WebDriver webDriver = new ChromeDriver(); // обьект драйвера здесь имеет доступ к методам драйвера Chrome которые определены в WebDriver Interface

    }
}
