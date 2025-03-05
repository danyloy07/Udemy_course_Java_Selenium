package section_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class End2EndTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("in");
        Thread.sleep(1000);
        List<WebElement> webElementList = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
        for (WebElement country:webElementList){
            if (country.getText().equalsIgnoreCase("Indonesia")){
                country.click();
                break;
            }
        }
        WebElement radioButton = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
        radioButton.click();
        Assert.assertTrue(radioButton.isSelected());
        Assert.assertTrue(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"));
        WebElement checkbox = driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount"));
        checkbox.click();
        Assert.assertTrue(checkbox.isEnabled());
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[text()=' Kochi (COK)']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTNR")).isDisplayed());
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='GOI']")).click();
        Assert.assertTrue(driver.findElement(By.id("ui-datepicker-div")).isDisplayed());
        driver.findElement(By.xpath("//td[@data-month='5' and @data-year='2019']/a[text()='10']")).click();
        Assert.assertEquals(driver.findElement(By.id("view_fulldate_id_1")).getText(), "Mon, Jun 10 2019");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);
        for (int i=1;i<5;i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
       driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select selectCurrency = new Select(staticDropdown);
        selectCurrency.selectByIndex(2);
        Assert.assertEquals(selectCurrency.getFirstSelectedOption().getText(),"AED");
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
        driver.quit();






    }
}
