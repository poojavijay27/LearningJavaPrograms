package ex_16_OOPs;

public class Lab136_OOps_P2 {
    public static void main(String[] args)
    {
        Student s1 = new Student();

        //1. Student - Class Loading
        //2. s1 - Object Ref.
        //3. new Student() -> Object creation

        s1.name = "John";
        s1.Roll_no = 102;
        System.out.println(s1.name);
        System.out.println(s1.Roll_no);
        s1.sleep();
    }
}
class Student
{
    String name;
    int Roll_no;

    void sleep()
    {
        System.out.println("sleeping");
    }
}