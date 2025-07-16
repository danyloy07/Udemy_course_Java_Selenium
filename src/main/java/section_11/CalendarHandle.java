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
        String month = "9";
        String date = "7";
        String year = "2001";
        String[] expectDate = {month,date,year};
        driver.findElement(By.xpath("//button[@class='react-date-picker__calendar-button react-date-picker__button']")).click();
        driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
        driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
        boolean found = false;

        while (!found) {
            List<WebElement> handleYear = driver.findElements(By.xpath("//button[@class='react-calendar__tile react-calendar__decade-view__years__year']"));
            for (int i = 0; i < handleYear.size(); i++) {
                String ye = handleYear.get(i).getText().trim();
                if (ye.equals(year)) {
                    handleYear.get(i).click();
                    found = true;
                    break;
                }
            }
            if (!found) {
                driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__prev-button']"))
                        .click();
            }
        }
        Assert.assertEquals(driver.findElement(
                        By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']"))
                .getText().trim(), year);
        driver.findElements(By.xpath("//abbr")).get(Integer.parseInt(month) - 1).click();
        driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();
       List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
        for (int i = 0; i < actualList.size(); i++) {
            Assert.assertEquals(actualList.get(i).getAttribute("value"), expectDate[i]);
        }
        driver.quit();
    }
}


