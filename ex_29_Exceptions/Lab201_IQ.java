package ex_29_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab201_IQ
{
    public static void main(String[] args)
    {
        System.out.println("Starting");
        try
        {
            FileReader f = new FileReader("C://abc.txt");
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
