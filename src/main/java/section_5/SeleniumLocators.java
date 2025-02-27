package section_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumLocators {
    public static void main(String[] args) {
        WebDriver driver = null; // Инициализируйте драйвер перед использованием

        // 1. Простые локаторы
        // По ID (уникальный идентификатор элемента)
        WebElement byId = driver.findElement(By.id("username"));

        // По имени (если name уникален на странице)
        WebElement byName = driver.findElement(By.name("password"));

        // По классу (если у элемента уникальный class)
        WebElement byClass = driver.findElement(By.className("login-button"));

        // По тегу (ищет элементы по названию тега, например, все кнопки)
        WebElement byTag = driver.findElement(By.tagName("button"));

        // 2. XPath локаторы
        // Полный путь к элементу по атрибуту
        WebElement byXpathFull = driver.findElement(By.xpath("//input[@id='username']"));

        // По частичному совпадению атрибута (например, если класс содержит определённое значение)
        WebElement byXpathContains = driver.findElement(By.xpath("//input[contains(@class, 'form-control')"));

        // По точному тексту элемента
        WebElement byXpathText = driver.findElement(By.xpath("//button[text()='Login']"));

        // Поиск родителя элемента (на уровень вверх)
        WebElement byXpathParent = driver.findElement(By.xpath("//button[@id='submit']/.."));

        // Поиск дочернего элемента (прямой потомок)
        WebElement byXpathChild = driver.findElement(By.xpath("//div[@class='container']/button"));

        // Поиск любого вложенного элемента (независимо от уровня вложенности)
        WebElement byXpathAnyChild = driver.findElement(By.xpath("//div[@class='container']//button"));

        // Поиск следующего элемента на том же уровне (сосед справа)
        WebElement byXpathFollowingSibling = driver.findElement(By.xpath("//label[@for='email']/following-sibling::input"));

        // Поиск предыдущего элемента на том же уровне (сосед слева)
        WebElement byXpathPrecedingSibling = driver.findElement(By.xpath("//input[@id='email']/preceding-sibling::label"));

        // Выбор первого элемента среди найденных
        WebElement byXpathFirstElement = driver.findElement(By.xpath("(//button[@class='btn'])[1]"));

        // Выбор последнего элемента среди найденных
        WebElement byXpathLastElement = driver.findElement(By.xpath("(//button[@class='btn'])[last()]"));

        // Выбор конкретного элемента по индексу (например, третий)
        WebElement byXpathNthElement = driver.findElement(By.xpath("(//button[@class='btn'])[3]"));

        // Поиск элемента, у которого атрибут частично совпадает с заданным значением
        WebElement byXpathAttributeContains = driver.findElement(By.xpath("//a[contains(@href, 'account')]"));

        // Поиск элемента с несколькими условиями
        WebElement byXpathMultipleConditions = driver.findElement(By.xpath("//input[@type='text' and @placeholder='Search']"));

        // 3. CSS селекторы
        // По ID (быстрый и надёжный способ)
        WebElement byCssId = driver.findElement(By.cssSelector("#username"));

        // По классу (если класс уникален)
        WebElement byCssClass = driver.findElement(By.cssSelector(".login-button"));

        // По атрибуту (например, input с определённым типом)
        WebElement byCssAttribute = driver.findElement(By.cssSelector("input[type='password']"));

        // По дочернему элементу (только прямой потомок)
        WebElement byCssChild = driver.findElement(By.cssSelector("div.container > button"));

        // По любому вложенному элементу (любой уровень вложенности)
        WebElement byCssAnyChild = driver.findElement(By.cssSelector("div.container button"));

        // Поиск следующего элемента на том же уровне (сосед справа)
        WebElement byCssAdjacentSibling = driver.findElement(By.cssSelector("label[for='email'] + input"));

        // Поиск элемента по порядковому номеру среди детей родителя (например, третий элемент списка)
        WebElement byCssNthChild = driver.findElement(By.cssSelector("ul.menu li:nth-child(3)"));
    }
}

