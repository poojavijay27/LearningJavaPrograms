package ex_19_OOPs_Polymorphism.MethodOverriding;

public class Lab157_MOverriding
{
    public static void main(String[] args)
    {
       Animal d1 = new Animal();
       d1.sound();
       Dog d2 = new Dog();
       d2.sound();
    }
}


class Animal
{
    void sound()
    {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Bark");
    }

}