package section_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        String[] arr = {"Danil", "Gabriel", "Sasha", "Andrey"};

        for (int i=0;i< arr.length;i++){
            if (arr[i] == "Sasha"){
                System.out.println(arr[i]);
            }
        }

        List<String> convertToArrayList = Arrays.asList(arr);
        System.out.println(convertToArrayList.contains("Sasha"));
    }
}
