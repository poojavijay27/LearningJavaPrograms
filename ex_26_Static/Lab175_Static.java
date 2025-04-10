package ex_26_Static;

public class Lab175_Static {
    class B {
        static {
            System.out.println("SIB, called once, class is Loaded");
        }

        int a = 10;
        static int b = 20;
    }
}