package ex_07_If_Condition;

public class Lab060_If_P1 {
    public static void main(String[] args)
    {
        int age = Integer.parseInt(args[0]);
        if (age > 18)
        {
            System.out.println("you can go to Goa" );
        }
        else {
            System.out.println("you can't go to Goa");
        }
    }
}
