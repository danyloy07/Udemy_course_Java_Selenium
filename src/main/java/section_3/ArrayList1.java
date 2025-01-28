package section_3;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(89);
        arrayList.add(99);
        arrayList.remove(0);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.contains(99));

    }
}
