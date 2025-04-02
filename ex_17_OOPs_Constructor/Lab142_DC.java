package ex_17_OOPs_Constructor;

public class Lab142_DC {
    public static void main(String[] args)
    {
       car c1 = new car();
       c1.name = "Harrier";
       System.out.println(c1.name);
       c1.year = 2019;
       System.out.println(c1.year);
       System.out.println(c1.model);

    }
}
class car
{
    String name;
    int year;
    String model;

    // DC
    car()
    {
        name = "Unknow Car";


        year = 1991;
        model =  "XXX";
    }
}
