package ex_17_OOPs_Constructor;

public class Lab139_OOPs_Constructor {
    public static void main(String[] args) {

        Baby b = new Baby();
        new Baby();             // 2 times called
        Baby b2;
        b.name = "Laasya";
        System.out.println(b.name);
        b.cry();
        b.sleep();
        b.eat();
    }
}


    class Baby
    {              // Attribute | Instance Variable |  Member variables, data members


        String name;

       // Behaviour
        void cry()
        {
            System.out.println("cry!");
        }
        void sleep()
        {
            System.out.println("sleep!");
        }
        void eat()
        {
            System.out.println("eat!");
        }

        // Default Constructor!

        Baby()
        {
            System.out.println("I am called, Default Constructors");

            // Fetch data from the MySQL database...
            // Read from CSV File , XLSX
            // Open a file and read the data. (json, testdata.xlsx, txt file)


        }
    }

