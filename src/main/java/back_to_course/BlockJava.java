package back_to_course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BlockJava {
    //Задание: Напиши класс, где: (1) массив из 5 имён, (2) переведи его в ArrayList, (3) через for-each выведи только
    // имена длиннее 4 букв, (4) проверь через .equals() есть ли там "Danya". Без подсказок.

    public static void exercise() {
        String[] names = {"Danya", "Yulya", "Slava", "Andrey", "Stas"};
        List<String> convertNames = new ArrayList<>(Arrays.asList(names));
        for (String name : convertNames) {
            if (name.length() > 4) {
                System.out.println(name);
            }
        }
        boolean bool = false;
        for (String name : convertNames) {
            if (name.equals("Danya")) {
                bool = true;
                break;
            }
        }
        System.out.println(bool);
        System.out.println(convertNames.contains("Danya"));
    }

    //Дана строка "BMW, Volvo, Kia, Mazda". Раздели её по запятой, выведи каждую марку с новой строки и без лишних
    // пробелов (подумай, где нужен trim()).
    public static void task2() {
        String cars = "BMW, Volvo, Kia, Mazda";
        String[] newCars = cars.split(", ");
        for (String consoleCar : newCars) {
            System.out.println(consoleCar);
        }
    }

    public static void task3() {
        //2. String — charAt и цикл
        //Дано слово "Selenium". Выведи его задом наперёд, по одной букве. (Подсказка: цикл от конца к началу + charAt.)
        String word = "Selenium";
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.println(word.charAt(i));
        }
    }


    public static void task4() {
        //Дан массив int[] nums = {5, 12, 8, 130, 44}. Через обычный for посчитай и выведи сумму всех чисел
        int[] nums = {5, 12, 8, 130, 44};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.println(sum);
    }

    public static void task5() {
        //Создай ArrayList<String> с городами: Kyiv, Lviv, Odesa, Kharkiv. Удали второй город (по индексу),
        // потом выведи все оставшиеся через for-each.

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Kyiv");
        cities.add("Lviv");
        cities.add("Odesa");
        cities.add("Kharkiv");
        cities.remove(1);
        for (String concole : cities) {
            System.out.println(concole);
        }
    }

    //Напиши два метода: greet(String name) — печатает «Привет, <имя>!» (ничего не возвращает), и square(int x) —
// возвращает квадрат числа. Вызови оба из main и результат square выведи в консоль.
    public static void greet(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public int square(int x) {
        return x * x;
    }

    //Сделай класс Calculator с нестатическим методом multiply(int a, int b) (возвращает произведение) и статическим методом
// info() (печатает «Это калькулятор»). В main вызови оба правильно: один через объект, другой напрямую.
    public int multiply(int a, int b) {
        return (a * b);
    }

    public static void info() {
        System.out.println("This is calculator");
    }

    //Дан массив имён {"Anna", "Petro", "Olha", "Ivan"}. Переведи его в список и через .contains() проверь, есть ли
    // там «Olha» и «Maria». Выведи оба ответа.
    public static void task6() {
        String[] names = {"Anna", "Petro", "Olha", "Ivan"};
        List<String> listNames = new ArrayList<>(Arrays.asList(names));
        System.out.println(listNames.contains("Olha"));
        System.out.println(listNames.contains("Maria"));
    }
//Дана строка "apple-banana-cherry-date". Раздели её по -, и через цикл выведи только те слова, длина которых больше 5 букв.
    public static void task7(){
        String value = "apple-banana-cherry-date";
        String[] arr = value.split("-");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()>5){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        exercise();
        task2();
        task3();
        task4();
        task5();
        greet("BOB");

        BlockJava method = new BlockJava();
        System.out.println(method.square(5));

        System.out.println(method.multiply(2, 3));
        info();

        task6();
        task7();

    }
}


