package ex_16_OOPs;

public class Lab137_Cats {
    public static void main(String[] args)
    {
        Cat c1 = new Cat();
        c1.name = "kavya";
        System.out.println(c1.name);

        Cat c2 = new Cat();
        Cat c3;
        new Cat();

        c1.running();
//        c2.running();

        new Cat().running();
        System.out.println(new Cat().name);
    }
}






class Cat
{
    String name;   // Null

    void running()
    {
        System.out.println("running");
    }
}