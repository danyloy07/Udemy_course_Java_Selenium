package section_3;

import java.util.Arrays;

public class StringToArray {
    public static void main(String[] args) {
        String car = "BMW, Volvo, Kia, Mazda";

        String[] splittedArray = car.split("Kia,");
        System.out.println(Arrays.toString(splittedArray));
        System.out.println(splittedArray[0]);
        System.out.println(splittedArray[1]);
        System.out.println("**************************");
        System.out.println(splittedArray[1].trim());
        System.out.println("**************************");
        for (int i = 0; i<car.length();i++){
            System.out.print(car.charAt(i));
        }
        System.out.println();
        for (int i = car.length()-1; i>=0 ; i--) {
            System.out.print(car.charAt(i));
        }
    }
}
