package ex_29_Exceptions;

public class Lab203_Throw
{
    public static void main(String[] args)
    {

    }
    static void divideByZero(int a)
    {
        // check some
        if (a==0)

        {
            throw new ArithmeticException();
        }
    }
}
