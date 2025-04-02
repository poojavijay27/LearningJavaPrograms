package ex_17_OOPs_Constructor;

public class Lab140_Example2 {
    public static void main(String[] args)
    {
        WebAutomation w1 = new WebAutomation();
    }
}
    class WebAutomation
    {
        // DC
        WebAutomation()
        {
            System.out.println("I Want to read a CSV file");
            System.out.println("open the page before loading the scripts");
            System.out.println("you can do anything  which you want to do, when object is created");

            // FileInputStream fileInputStream = new FileInputStream("C://a.txt");

        }
    }

