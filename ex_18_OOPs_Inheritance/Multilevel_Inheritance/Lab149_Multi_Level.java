package ex_18_OOPs_Inheritance.Multilevel_Inheritance;

public class Lab149_Multi_Level
{
  //  Son s1 = new GrandFather();
  //  Son s2 = new Father();

    Son amit = new Son();

    GrandFather g7 = new Son(); // Dynamic Dispatch
    //    g7.gf();
    //    g7.home();


    GrandFather g2 = new Father();
    //    g2.home();


    Father f2 = new Son();
    //    f2.home();
    // Father f3 = new GrandFather();

    // WebDriver driver = new ChromeDriver();



}
