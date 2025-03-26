package ex_10_While;

import java.util.Scanner;

public class Lab093_While_IQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Factorial Number");
        int num = sc.nextInt();

        int factorial = 1;
        if(num <=0) {
            System.out.println(factorial);
        }
            else
            {
                for (int i = 1 ;i<= num ; i++)
                {
                    factorial = factorial*i;

                }
            }
            System.out.println("Factorial is -> " +factorial);
        }

    }

