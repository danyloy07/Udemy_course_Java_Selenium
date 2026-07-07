package back_to_course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RepeatLocators {
    /* Восемь способов By:
            By.id("inputUsername")
            By.name("inputPassword")
            By.className("signInBtn")
            By.tagName("button")
            By.linkText("Forgot your password?")        // только для <a> по полному тексту
            By.cssSelector("p.error")
            By.xpath("//input[@id='inputUsername']")*/

 /* CSS locators:
 по id --> #username
 по class --> .login-button
 тег+class --> button.signInBtn
 по атрибуту --> input[type='password']
 частичное совпадение --> input[type*='pass']
 прямой потомок --> div.container > button
 любой потомок --> div.container button
 сосед справа --> label[for='email'] + input
 n-й ребёнок --> li:nth-child(3)
  */

  /* XPath selectors:
//input[@id='username']                          // по атрибуту
//button[text()='Login']                         // по точному тексту
//input[contains(@class,'form-control')]         // частичное совпадение
//button[@id='submit']/..                        // родитель
//div/button                                     // прямой ребёнок
//div//button                                    // любой потомок
//label[@for='email']/following-sibling::input   // сосед справа
//input[@id='email']/preceding-sibling::label    // сосед слева
(//button[@class='btn'])[1]                       // первый
(//button[@class='btn'])[last()]                  // последний
//input[@type='text' and @placeholder='Search']  // несколько условий
     */

    /*
    <input type="text" id="username" class="form-control" placeholder="Имя">
    input --> тег (tag) --> тип элемента — поле ввода
    type, id, class, placeholder --> атрибуты (attributes)--> свойства элемента
    "text", "username", "form-control" --> значения атрибутов --> конкретные значения этих свойств
     */

    //Задание: Открой rahulshettyacademy.com/locatorspractice/. Залогинься, но каждое поле найди другим типом локатора:
    // username — по id, password — по name, checkbox — по xpath, кнопку — по cssSelector. Текст ошибки достань через p.error.
    static WebDriver driver = new ChromeDriver();
    public static void locatorPractice(){
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    driver.manage().window().maximize();
    driver.get("https://rahulshettyacademy.com/locatorspractice/");
    driver.findElement(By.id("inputUsername")).sendKeys("danil");
    driver.findElement(By.name("inputPassword")).sendKeys("1234");
    driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
    driver.findElement(By.cssSelector(".submit")).click();
    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
    driver.findElement(By.linkText("Forgot your password?")).click();
    driver.quit();
}

public void moreLocators(){
    //<input type="email" id="user-email" name="email" class="form-input" placeholder="Введите email">
    //Напиши 4 разных локатора на это поле: по id, по name, по class (css), по тегу+атрибуту (xpath).
    driver.findElement(By.id("user-email"));
    driver.findElement(By.name("email"));
    driver.findElement(By.cssSelector(".form-input"));
    driver.findElement(By.xpath("//input[@type='email']"));

    //<button class="btn btn-success register">Зарегистрироваться</button>
    //Напиши 2 локатора: один через cssSelector (по классу), один через xpath по тексту кнопки.
    driver.findElement(By.cssSelector(".btn"));
    driver.findElement(By.xpath("//button[text()='Зарегистрироваться']"));

    //<a href="/account/settings" class="nav-link active menu-item">Настройки</a>
    //Напиши 3 локатора: (1) xpath по тексту, (2) css по одному из классов, (3) xpath с contains по href (поймать по части account).
    driver.findElement(By.xpath("//a[text()='Настройки']"));
    driver.findElement(By.cssSelector(".active"));
    driver.findElement(By.xpath("//a[contains(@href,'account')]"));

    //<div class="row">
    //    <label for="phone">Телефон</label>
    //    <input id="phone" type="text">
    //</div>
    //Найди input, оттолкнувшись от label: (1) через xpath following-sibling, (2) через css +. (Представь, что у input
    // нет id — нельзя его использовать напрямую.)
    driver.findElement(By.xpath("//label[@for='phone']/following-sibling::input"));
    driver.findElement(By.cssSelector("label[for='phone'] + input"));

    //<ul id="cities">
    //    <li>Kyiv</li>
    //    <li>Lviv</li>
    //    <li>Odesa</li>
    //    <li>Kharkiv</li>
    //</ul>
    //Напиши локаторы, чтобы выбрать: (1) третий город (Odesa) — через css nth-child И отдельно через xpath с индексом;
    // (2) последний город — через css last-child И через xpath last().

    driver.findElement(By.cssSelector("li:nth-child(3)"));
    driver.findElement(By.xpath("//ul/li[3]"));
    driver.findElement(By.cssSelector("li:last-child"));
    driver.findElement(By.xpath("//ul/li[last()]"));

    //<div class="product">
    //    <h4 class="product-name">iPhone 15</h4>
    //    <div class="product-action">
    //        <button>Add to cart</button>
    //    </div>
    //</div>
    //Напиши xpath, который: найдёт <h4> с текстом iPhone 15, поднимется к родителю div.product, и оттуда спустится к
    // кнопке Add to cart. (Это реальный приём из твоего EcommerceProject — связать товар с его кнопкой.)

    driver.findElement(By.xpath("//h4[text()='iPhone 15']/..//button"));

}

    public static void main(String[] args) {
        locatorPractice();
    }

}
