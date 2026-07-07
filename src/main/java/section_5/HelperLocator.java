package section_5;

public class HelperLocator {
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
 tagname#id --> input#inputUserName
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
}
