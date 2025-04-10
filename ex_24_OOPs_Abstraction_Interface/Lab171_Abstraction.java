package ex_24_OOPs_Abstraction_Interface;

public class Lab171_Abstraction
{
    class ConcreateClass implements Incomplete_Interface{

        @Override
        public void display()
        {
            System.out.println("Hi");
        }
    }

    interface Incomplete_Interface
    {
        int a = 10; // final
        void display();

        default void display2()
        {
            System.out.println("Default is allowed!");
        }

        static void display3()
        {
            System.out.println("Default is allowed!");
        }
    }

    abstract class Incomplete_abstract
    {
        int a= 10;
        abstract void display1();
        void display2(){

        }
    }
}
