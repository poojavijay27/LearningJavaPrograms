package ex_18_OOPs_Inheritance.Multilevel_Inheritance;

public class Lab148_Multil_Level
{
    public static void main(String[] args)
    {
        GrandFather gf = new GrandFather();
        gf.gf();

        System.out.println(" ----------- ");

        Father f1 = new Father();
        f1.f();
        f1.gf();

        System.out.println(" ----------- ");

        Son s1 = new Son();
        s1.gf();
        s1.f();
        s1.s();
    }
}
