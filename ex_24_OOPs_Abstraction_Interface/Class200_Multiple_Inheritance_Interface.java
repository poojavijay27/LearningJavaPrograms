package ex_24_OOPs_Abstraction_Interface;

public class Class200_Multiple_Inheritance_Interface
{

}
interface Mother
{
    void money();
}
interface Father
{
    void money();
}
class child implements Mother,Father
{
    @Override
    public void money()
    {
        System.out.println("Child Money");
    }
}