package ex_05_Ternary_Operator;

public class Lab045_TO {
    public static void main(String[] args)
    {
        int x = 20;
        int y = 30;
        System.out.println(Math.max(x,y));

        int max = x > y ? x : y;
        System.out.println(max);
    }
}
