package section_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DisabledOrEnabledWebElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //Такое решение можно использовать в случае если елемент вроде віглядит неактивнім, ко при клике на него он становится активнім
        boolean enabled = driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1");
        Assert.assertTrue(enabled);
        System.out.println("Element state: " + (enabled ? "enabled" : "disabled"));
        // Простая проверка как активность элемента
        // boolean enabled1 = driver.findElement(By.id("Div1")).isEnabled();
    }
}