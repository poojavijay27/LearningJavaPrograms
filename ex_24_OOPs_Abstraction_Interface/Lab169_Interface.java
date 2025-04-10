package ex_24_OOPs_Abstraction_Interface;

public class Lab169_Interface
{
    public static void main(String[] args)
    {
        Car1 c1 = new Car1();
        c1.drive();
    }
}

class Car1 implements Engine1, Brakes
{

    void drive()
    {
        startEngine();
        applyBreak();
        stopEngine();
    }

    @Override
    public void applyBreak()
    {
        System.out.println("Apply Break");
    }

    @Override
    public void startEngine()
    {
        System.out.println("Start Engine");

    }

    @Override
    public void stopEngine()
    {
        System.out.println("Stop Engine");
    }
}















interface Brakes{
    void applyBreak();
}

interface Engine1{
    void startEngine();
    void stopEngine();
    default void test(){
        System.out.println("concrete complete");
    }

}