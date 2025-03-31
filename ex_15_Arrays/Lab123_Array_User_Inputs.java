package ex_15_Arrays;

import java.util.Scanner;

public class Lab123_Array_User_Inputs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array(int) only");
        int size = sc.nextInt();

        // int[] marks =  new int[size];
        //  float[] numbers_marks =  new float[size];
        String[] numbers = new String[size];


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the numbers");
            numbers[i] = sc.next();
        }
        System.out.println(" ---- ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        sc.close();


    }
    }