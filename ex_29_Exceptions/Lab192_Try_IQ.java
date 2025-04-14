package ex_29_Exceptions;

public class Lab192_Try_IQ
{
    public static void main(String[] args)
    {
        try
        {
            String s1 = null;
            s1.trim();
            int a = 10/0;
        }
        catch (NullPointerException | ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}