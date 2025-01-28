package section_3;

public class CodingExercise {
    public static void main(String[] args) {
                int[] numbers = {1,2,3,4,5};
                System.out.println(numbers[0]);
        System.out.println(numbers[4]);
        //Using a loop, print the elements of the numbers array in reverse order.
        for (int i=numbers.length -1;i>=0;i--){
            System.out.print(numbers[i]);
        }
        System.out.print(numbers.length);
            }

        }
