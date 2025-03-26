package section_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CalendarHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        List<String> listOfValues= new ArrayList<>();
        listOfValues.add("9");
        listOfValues.add("7");
        listOfValues.add("2027");
        String in = "43";

        driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
        for (int i = 0; i < 2; i++){
            driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
        }
        driver.findElement(By.xpath("//button[text()='"+listOfValues.get(2)+"']")).click();
        driver.findElements(By.xpath("//button[contains(@class,'react-calendar__tile')]"))
                .get(Integer.parseInt(listOfValues.get(0))-1).click();
        driver.findElement(By.xpath("//abbr[text()='"+listOfValues.get(1)+"']")).click();

        List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
        for(int i =0; i<actualList.size();i++) {
            System.out.println(actualList.get(i).getAttribute("value"));
            Assert.assertEquals(actualList.get(i).getAttribute("value"), listOfValues.get(i));
        }
        driver.close();
    }
}

