package section_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class EcommerceProject {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        int j = 0;
        String[] products = {"Capsicum", "Raspberry", "Mango"};
        List<WebElement> listOfProducts = driver.findElements(By.xpath("//h4[@class='product-name']"));
       for (int i = 0;i<listOfProducts.size(); i++){
           String[] getProducts = listOfProducts.get(i).getText().split("-");
           String correctName = getProducts[0].trim();
           List itemsNeededList = Arrays.asList(products);
           if (itemsNeededList.contains(correctName)){
               j++;
               driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
            if(j==products.length){
                break;
               }
           }
       }

    }

    }