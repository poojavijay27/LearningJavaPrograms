package ex_18_OOPs_Inheritance.Multilevel_Inheritance;

public class Lab150_Multi_Level
{
    public static void main(String[] args) {


//        Son s1 = new GrandFather();
//        Son s1 = new Father();
        Son amit = new Son();
        amit.s();
        amit.f();
        amit.gf();
        System.out.println(amit.gold_gf);

        Father f1 = new Father();
        f1.home();

        GrandFather gf1 = new GrandFather();
        gf1.home();


        GrandFather grandFather = new Son();
        grandFather.home();



    }
}

