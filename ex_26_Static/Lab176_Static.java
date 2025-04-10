package ex_26_Static;

public class Lab176_Static
{
    public static void main(String[] args)
    {
        B.commonTOAll();
        System.out.println(B.b);    // called using class name


        B b_ref = new B();
        b_ref.display();
        System.out.println(b_ref.a);   // need to create object for non static

    }
}

class B
{
    static
    {
        System.out.println("SIB, called once , class is loaded");
    }

    int a = 10;         // non static
    static int b = 20;  //  static -> common to all

    void display()
    {
        System.out.println(b);
        System.out.println(" Non static F(n)");
    }
    static void commonTOAll()
    {
      //  System.out.println(a);
        System.out.println("static F(n)");
    }

//    static class C
//    {
//        // Not useful
//    }
}
