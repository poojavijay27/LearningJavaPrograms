package ex_29_Exceptions;

public class Lab190_Try_Catch_Multiple
{
    public static void main(String[] args)
    {
        System.out.println("1");
        try
        {
            int a = 10 / 0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("ARE YOU FOOL");
        }
        catch (Exception e)
        {
            System.out.println("ARE YOU FOOL");
        }
        System.out.println("2");

    }
}


