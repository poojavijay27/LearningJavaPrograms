package ex_15_Arrays;

import java.util.Arrays;

public class Lab126_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args)
    {
        // Find Second Largest Number in an Array

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        // 100 , 34

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-1]);
        System.out.println(numbers[numbers.length-2]);  // output -> 34
        System.out.println(numbers[numbers.length-3]);
    }
}
