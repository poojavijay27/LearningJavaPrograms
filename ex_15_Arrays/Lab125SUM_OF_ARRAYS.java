package ex_15_Arrays;

public class Lab125SUM_OF_ARRAYS {
    public static void main(String[] args) {

        int[] numbers = {5, 9, 10};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);

        System.out.println("------------------");

        //FOR EACH (Enhanced Loop)

        for (int n : numbers) {
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
