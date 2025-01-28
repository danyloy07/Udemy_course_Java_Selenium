package section_3;

import java.util.ArrayList;

public class LoopArrayList {
    public static void LoopArray(){
        ArrayList<String> car = new ArrayList<String>();
        car.add("BMW");
        car.add("Kia");
        car.add("Tesla");
        car.add("Volvo");
        car.add("Mazda");

        for (int i=0;i< car.size();i++){
            System.out.println(car.get(i));
        }
        System.out.println("*************************************");

        for (String carForEach:car){
            System.out.println(carForEach);
        }
    }

    public static void main(String[] args) {
        LoopArray();
    }
}
