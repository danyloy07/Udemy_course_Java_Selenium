package back_to_course;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class RepeatSection6 {
    //Задание: Напиши метод, который принимает строку "User: admin Pass: secret123" и возвращает только пароль через split.
    // Потом проверь его в main.

    public String splitPass(String logAndPass) {
        return logAndPass.split(":")[2].trim();
    }

    //Напиши метод, который:
    //Открывает https://www.google.com, сохраняет ID этого окна в переменную.
    //Переходит (navigate().to) на https://rahulshettyacademy.com/AutomationPractice/.
    //Делает back(), потом forward() (просто чтобы прочувствовать навигацию).
    //Открывает новую вкладку (WindowType.TAB), сохраняет её ID.
    //В новой вкладке открывает https://www.autodoc.de и выводит её getTitle().
    //Переключается обратно на первую вкладку по сохранённому ID и выводит её

    public static void windowHandle(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String firstID = driver.getWindowHandle();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.switchTo().newWindow(WindowType.TAB);
        String secondID = driver.getWindowHandle();
        driver.get("https://www.autodoc.de");
        System.out.println(driver.getTitle());
        driver.switchTo().window(firstID);
        System.out.println(driver.getCurrentUrl());
        driver.quit();

    }

    public static void main(String[] args) {
        RepeatSection6 method = new RepeatSection6();
        System.out.println(method.splitPass("User: admin Pass: secret123"));
        windowHandle();
    }
}
