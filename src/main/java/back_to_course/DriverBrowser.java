package back_to_course;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverBrowser {
    //Запусти Chrome, открой autodoc.de, выведи в консоль title и URL, разверни окно, закрой браузер. По памяти.
    public void callBrowser(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.autodoc.de/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();
        driver.quit(); // закрыть весь браузер + все вкладки
        //driver.close();  - закрыть текущую вкладку

    }
    public static void main(String[] args) {
    DriverBrowser method = new DriverBrowser();
    method.callBrowser();
    }
}
