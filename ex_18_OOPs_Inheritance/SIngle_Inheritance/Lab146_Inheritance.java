package ex_18_OOPs_Inheritance.SIngle_Inheritance;

public class Lab146_Inheritance {

    public static void main(String[] args)
    {
        mother m1 = new mother();
        System.out.println(m1.gold);
        m1.bhk2();

        Daughter D1 = new Daughter();
        System.out.println(D1.gold);
        D1.bhk3();
    }
}
