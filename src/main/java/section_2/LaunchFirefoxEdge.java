package section_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class LaunchFirefoxEdge {
    public static void firefoxLaunch () {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\danyloy\\Documents\\geckodriver.exe");

        // Укажите путь к portable Firefox
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Users\\danyloy\\Documents\\PortableApps\\FirefoxPortable\\App\\Firefox\\firefox.exe");

        WebDriver driver = new FirefoxDriver(options);
        driver.get("https://autodoc.de");
        System.out.println(driver.getTitle());
        driver.quit();

    }

    public static void edgeLaunch (){

        System.setProperty("webdriver.edge.driver", "C:\\Users\\danyloy\\Documents\\msedgedriver.exe");

        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://autodoc.de");
        System.out.println(webDriver.getTitle());
        webDriver.close();
    }

    public static void main(String[] args) {
        firefoxLaunch();
        edgeLaunch();
    }
}
