package back_to_course;

import java.sql.Array;
import java.util.ArrayList;

public class RepeatArrayList {
    public static void ArrayList() {
        ArrayList<String> list = new ArrayList<>(); // динамический, .size(), .add(), .get(), .remove(), .contains()
        list.add("Hello");
        list.add("World");
        list.add("Java");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    public static void methodsArrayList() {
        ArrayList <String> arrayList = new ArrayList<String>();
        arrayList.add("BMW");
        arrayList.add("Mazda");
        arrayList.add("Volvo");
        arrayList.remove(1);

        for (int i = 0; i< arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

    }

    public static void main (String[] args){
ArrayList();
methodsArrayList();
    }
}
