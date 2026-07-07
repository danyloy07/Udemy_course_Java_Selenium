package back_to_course;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StringMethods {
    public static void split() {
        String splitString = "Danil-Selenium-Java";
        String[] splitArr = splitString.split("-");
        System.out.println(splitArr[0]);
        System.out.println(splitArr[1]);
        System.out.println(splitArr[2]);
    }

public static void trim() {
    String trimString = "  Java Selenium  ";
    String trimresult = trimString.trim();
    System.out.println(trimresult);
}

public void contains(){
        String containsSmth = "Selenium WebDriver Java";
    System.out.println(containsSmth.contains("WebDriver"));
    System.out.println(containsSmth.contains("Python"));
}

public static void charAt(){
    String charAtString = "Selenium";
    for (int i = charAtString.length()-1; i>=0; i--){
        System.out.println(charAtString.charAt(i));
    }

}

    public static void main(String[] args) {
        split();
        trim();

        StringMethods stringMethods = new StringMethods();
        stringMethods.contains();

        charAt();
    }
    }

