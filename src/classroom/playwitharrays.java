package classroom;

import java.util.Arrays;

public class playwitharrays {
    public static void main(String[] args) {

        int[] numbers;

        numbers = new int[10];

        System.out.println(Arrays.toString(numbers));

        // Before: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        // After: [0, 2, 0, 4, 0, 6, 0, 8, 0, 10]

        numbers[1] = 2;
        numbers[1] = 2;
        numbers[1] = 2;

        System.out.println(Arrays.toString(numbers));

        int[] evenNumbers = {2, 4, 6, 8, 10, 12};

        String[] names = {"John", "Michael", "Anna", "Mary"};

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);


        String[] fruit = {"Mango", "Banana", "Papaya", "Apple", "Coconut"};

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);



    }
}
