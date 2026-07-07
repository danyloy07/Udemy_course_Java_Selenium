# Java + Selenium repeat plan

Цель: быстро восстановить все темы, которые уже были в проекте, и не перейти к новому материалу с дырками в базе.

## Как заниматься

1. Открывай блок по порядку.
2. Сначала перепиши/объясни код своими словами без запуска.
3. Потом запусти старые файлы из `section_*`.
4. После этого повтори тему в `back_to_course` с нуля или допиши недостающий повтор.
5. Блок считается закрытым, если ты можешь написать мини-задание без подсказок.

## Что уже начато в back_to_course

- Java база: `Array`, `RepeatArrayList`, `StringMethods`, `RepeatMethods`, `BlockJava`.
- Selenium старт: `DriverBrowser`.
- Локаторы: `RepeatLocators`.
- Навигация, вкладки, `split` пароля: `RepeatSection6`.
- Практические задания: `Ass1`, `Ass2`, `Ass3`.

## Блок 1. Java база, без Selenium

Старые файлы: `section_3`.

Повторить:

- `main`, классы, создание объекта через `new`.
- `static` и non-static методы.
- `void` методы и методы с `return`.
- Вызов метода из другого класса.
- Массивы: `String[]`, `int[]`, `.length`, доступ по индексу.
- Обычный `for`, обратный `for`, `for-each`.
- `ArrayList`: `add`, `get`, `remove`, `size`, `contains`.
- `Arrays.asList`.
- `String`: `split`, `trim`, `contains`, `charAt`, `equals`, `equalsIgnoreCase`, `length`.
- Простая логика: `if`, `break`, счетчик, сумма чисел.

Мини-проверка:

- Из строки `"User: admin Pass: secret123"` достать только пароль.
- Из массива имен вывести только имена длиннее 4 букв.
- Из строки `"BMW, Volvo, Kia, Mazda"` получить массив и вывести значения без лишних пробелов.
- Написать non-static `square(int x)` и static `info()`.

## Блок 2. Запуск браузера и WebDriver

Старые файлы: `section_2`.

Повторить:

- `WebDriver driver = new ChromeDriver()`.
- Разница между переменной типа `ChromeDriver` и `WebDriver`.
- Selenium Manager и старый ручной `System.setProperty`.
- Запуск Chrome, Firefox, Edge.
- `driver.get(url)`.
- `getTitle()`, `getCurrentUrl()`.
- `manage().window().maximize()`.
- `close()` против `quit()`.

Мини-проверка:

- Открыть сайт, вывести title и current URL, развернуть окно, закрыть браузер через `quit()`.
- Объяснить, почему обычно лучше держать переменную как `WebDriver`.

## Блок 3. Локаторы

Старые файлы: `section_5`, `section_6/Locators`, `section_6/DynamicPassword`.

Повторить:

- HTML: tag, attribute, value, text.
- `findElement` и `findElements`.
- `By.id`, `By.name`, `By.className`, `By.tagName`, `By.linkText`, `By.cssSelector`, `By.xpath`.
- CSS: `#id`, `.class`, `tag.class`, `[attr='value']`, `[attr*='part']`, `parent > child`, `parent child`, `+`, `nth-child`, `last-child`.
- XPath: `//tag[@attr='value']`, `text()`, `contains()`, parent `..`, direct child `/`, any child `//`, indexes, `last()`, `following-sibling`, `preceding-sibling`, multiple conditions with `and`.
- Получение текста: `getText()`.
- Очистка поля: `clear()`.
- Динамический пароль: достать текст, разбить через `split`, использовать результат в логине.
- TestNG `Assert.assertEquals`, `assertTrue`, `assertFalse`.

Мини-проверка:

- На `locatorspractice` залогиниться правильным паролем, который ты сначала достаешь со страницы восстановления пароля.
- Один и тот же элемент найти 3 разными локаторами.
- Для товара найти кнопку через связь с названием товара: `//h4[text()='...']/..//button`.

## Блок 4. Навигация, окна и вкладки: основа

Старые файлы: `section_6/WindowManage`, `section_6/HelperWindowHandler`, `back_to_course/RepeatSection6`.

Повторить:

- `navigate().to`, `back`, `forward`, `refresh`.
- `getWindowHandle()` для текущего окна.
- `switchTo().newWindow(WindowType.TAB)`.
- `switchTo().newWindow(WindowType.WINDOW)`.
- `switchTo().window(id)`.
- Сохранение ID первой и второй вкладки в переменные.

Мини-проверка:

- Открыть Google, сохранить ID окна.
- Перейти на AutomationPractice, сделать back/forward.
- Открыть новую вкладку, открыть другой сайт, вывести title.
- Вернуться в первую вкладку по ID и вывести URL.

## Блок 5. Базовые UI-элементы

Старые файлы: `section_7`.

Повторить:

- Checkbox: `click`, `isSelected`, подсчет чекбоксов через `findElements(...).size()`.
- Radio button: выбор и проверка `isSelected`.
- Проверка видимости/активности: `isDisplayed`, `isEnabled`, `getDomAttribute("style")`.
- Static dropdown через `Select`: `selectByIndex`, `selectByValue`, `selectByContainsVisibleText`, `getFirstSelectedOption`.
- Updated dropdown: увеличение пассажиров через цикл.
- Dynamic dropdown: from/to города и ограничение области XPath.
- Auto-suggestive dropdown: список подсказок, цикл по `List<WebElement>`, `equalsIgnoreCase`, `break`.
- Calendar UI: открыть календарь, перейти на следующий месяц, выбрать день через XPath.
- Alerts: `switchTo().alert()`, `getText`, `accept`, `dismiss`, `sendKeys`.
- JavaScript scroll: `JavascriptExecutor`.

Мини-проверка:

- Повтори `Assignment1` и `Assignment2` без подсказок.
- На dropdowns page выбрать страну из autosuggest, выбрать radio, checkbox, from/to, дату, пассажиров, валюту и нажать поиск.
- На demoqa alerts обработать alert, timer alert, confirm и prompt.

## Блок 6. End-to-end flow на форме путешествия

Старый файл: `section_7/End2EndTest`.

Повторить:

- Сценарий из нескольких UI-действий подряд.
- Проверки после каждого важного действия.
- Смешивание разных типов элементов: autosuggest, radio, enabled state, checkbox, dynamic dropdown, calendar, passenger dropdown, static dropdown.
- Почему длинный сценарий лучше потом дробить на методы.

Мини-проверка:

- Переписать сценарий так, чтобы были методы:
  - `selectCountry`
  - `selectTripType`
  - `selectCities`
  - `selectDate`
  - `selectPassengers`
  - `selectCurrency`

## Блок 7. Ecommerce: списки, товары, корзина

Старый файл: `section_8/EcommerceProject`.

Повторить:

- `List<WebElement>` товаров.
- Как текст `"Mango - 1 Kg"` превратить в `"Mango"` через `split("-")` и `trim()`.
- Массив нужных товаров `String[]`.
- `Arrays.asList(products)`.
- `contains(correctName)`.
- Связь индекса товара и индекса кнопки Add to cart.
- Счетчик `j` и остановка через `break`, когда все товары добавлены.

Мини-проверка:

- Добавить в корзину только товары из массива.
- Вывести в консоль названия всех добавленных товаров.
- Объяснить, почему кнопка берется через `.get(i)`.

## Блок 8. Waits

Старые файлы: `section_9`.

Повторить:

- Почему `Thread.sleep` плох для стабильных тестов.
- Implicit wait: действует на поиск элементов.
- Explicit wait: `WebDriverWait` + `ExpectedConditions`.
- `visibilityOfElementLocated`, `visibilityOf`, `alertIsPresent`, `urlToBe`.
- Fluent wait: timeout, polling interval, ignored exception, custom function.
- В новом коде предпочитать `Duration.ofSeconds(...)`.

Мини-проверка:

- Переписать ecommerce checkout с explicit wait.
- Дождаться promo message и проверить текст.
- Написать FluentWait для dynamic loading page.

## Блок 9. Окна, табы, фреймы, Actions

Старые файлы: `section_10`.

Повторить:

- `getWindowHandles()` возвращает `Set<String>`.
- `Iterator<String>` и порядок переключения между parent/child.
- Достать email из дочернего окна через `split` и вставить в parent.
- Frames: `switchTo().frame("frame1")`, frame как WebElement, nested frames.
- Возврат из frame: `defaultContent()`.
- `Actions`: `moveToElement`, `click`, `keyDown`, `keyUp`, `sendKeys`, `doubleClick`, `contextClick`, `dragAndDrop`, `build().perform()`.
- `Keys.SHIFT`, `Keys.BACK_SPACE`.
- Drag and drop + проверка результата.

Мини-проверка:

- Открыть child window, вывести текст child и parent.
- В nested frames добраться до middle frame и вывести `MIDDLE`.
- На странице drag/drop перетащить элемент и проверить `"Dropped!"`.
- На Autodoc потренировать hover, ввод большими буквами через `Actions`, double click, context click.

## Блок 10. Ссылки, отдельные вкладки, сложный календарь

Старые файлы: `section_11`.

Повторить:

- Поиск ссылок на всей странице через `By.tagName("a")`.
- Ограничение поиска внутри конкретного блока: `footer.findElements(...)`.
- Открытие ссылок в новых вкладках через `Keys.chord(Keys.CONTROL, Keys.ENTER)`.
- Перебор всех вкладок и вывод title.
- React calendar:
  - открыть picker;
  - перейти на выбор года/месяца;
  - выбрать year, month, day;
  - проверить значения input fields.
- Assignment 6: связать checkbox value, dropdown value и alert text.

Мини-проверка:

- Посчитать все ссылки, ссылки footer и ссылки первой колонки.
- Открыть ссылки первой колонки в отдельных вкладках и вывести titles.
- Выбрать дату в календаре и проверить day/month/year через список ожидаемых значений.

## Блок 11. Финальный повтор перед новым материалом

Сделать 3 маленьких проекта без подсказок:

1. Login project:
   - достать временный пароль;
   - залогиниться;
   - проверить welcome text;
   - logout;
   - проверить возврат на sign in.

2. Shop project:
   - выбрать товары из массива;
   - добавить в корзину;
   - перейти checkout;
   - применить promo code;
   - проверить сообщение.

3. Practice page project:
   - checkbox -> dropdown -> input -> alert;
   - проверить, что alert содержит выбранный option.

## Что учить новым только после этого

Переходи дальше, когда уверенно можешь:

- выбрать правильный локатор без угадывания;
- заменить `Thread.sleep` на wait;
- объяснить разницу между `getWindowHandle` и `getWindowHandles`;
- переключиться в frame и вернуться назад;
- написать цикл по `List<WebElement>`;
- достать часть строки через `split`/`trim`;
- сделать 3-5 `Assert` в одном сценарии.

