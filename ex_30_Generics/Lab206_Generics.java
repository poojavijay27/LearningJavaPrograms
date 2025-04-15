package ex_30_Generics;

public class Lab206_Generics {
    public static void main(String[] args)
    {
        int sum = temp_sum(7,7);
        System.out.println(sum);
        double sum1 = temp_sum(4.44,7.55);
        System.out.println(sum1);
        String sum3 = temp_sum("Shreya"  ,   "Sushanth");
        System.out.println(sum3);
    }

    static int temp_sum(int a, int b) {
        return a + b;
    }

    static double temp_sum(double a, double b) {
        return a + b;
    }

    static String temp_sum(String a, String b)
    {
        return a + b;
    }
}