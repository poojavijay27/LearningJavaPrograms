package ex_15_Arrays;

import java.util.Scanner;

public class Lab133_2d_Multiplication_Table
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        for (int i = 0; i < size ; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.print(i + "x" + j + "=" + (i * j) + "\t\t");

                //System.out.print((i * j) + "\t");
            }
            System.out.println();
        }


    }
}
