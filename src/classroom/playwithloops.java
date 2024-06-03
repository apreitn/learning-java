package classroom;

public class playwithloops {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for(int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

        // sum from 1 to 10

        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("Sum: " + sum);

        // print elements from array
        int[] numbers = {4, 34, 83, 12, 67, 5, 18};
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for(int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        int number = 5;
        for(int i=1; i <= 10; i++) {
            int result = number * i;
            System.out.println(String.format("%d * %d = %d", number, i, result));
        }


    }
}
