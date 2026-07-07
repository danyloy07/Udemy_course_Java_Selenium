package back_to_course;

import java.util.Arrays;
import java.util.List;

public class Array {
    public static void array() {
        String[] arr = {"Danil", "Sasha", "Yulya"}; // массив, фиксированный размер, .length
        List<String> l = Arrays.asList(arr); // массив → список
        System.out.println(l);

        for (String s : arr){
            System.out.println(s);
        }

    }

    public static void main(String[] args) {
        array();
    }
}
