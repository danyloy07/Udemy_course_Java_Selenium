package section_6;

public class HelperWindowHandler {
    //Навигация по истории браузера:
    //driver.get("https://google.com");              // открыть страницу
    //driver.navigate().to("https://...");           // перейти на другую (как get, но в истории)
    //driver.navigate().back();                       // назад
    //driver.navigate().forward();                    // вперёд
    //driver.navigate().refresh();                    // обновить

    //Окна и вкладки:
    //String winID = driver.getWindowHandle();        // ID текущего окна (одна строка)
    //driver.switchTo().newWindow(WindowType.TAB);     // открыть новую вкладку и перейти в неё
    //driver.switchTo().newWindow(WindowType.WINDOW);  // открыть новое окно
    //driver.switchTo().window(winID);                 // вернуться в окно по его ID
}
