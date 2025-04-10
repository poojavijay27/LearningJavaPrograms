package ex_26_Static;

public class Lab173_Static_IIB
{
    public static void main(String[] args) {


        P p1 = new P();
    }
}

class P
{
    static
    {
        System.out.println("SIB");
    }

    {
        System.out.println("IIB");
    }

    P()

    {
        System.out.println("DC");
    }
}