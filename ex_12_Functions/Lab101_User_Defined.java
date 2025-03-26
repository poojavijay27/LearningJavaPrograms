package ex_12_Functions;

public class Lab101_User_Defined {
    public static void main(String[] args)
    {
        int r1 =  sum_of_two_numbers(7,9);
        System.out.println(r1);
        int r2 =  sum_of_two_numbers(27,10);
        System.out.println(r2);
    }

    static int sum_of_two_numbers(int a , int b )
    {
    return a+b;
    }
}
