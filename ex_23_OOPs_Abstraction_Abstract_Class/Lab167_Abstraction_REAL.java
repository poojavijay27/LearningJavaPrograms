package ex_23_OOPs_Abstraction_Abstract_Class;

public class Lab167_Abstraction_REAL
{
    public static void main(String[] args) {

    }
    abstract class Employee{

        private String name;
        private String address;
        private int number;

        Employee()
        {
            System.out.println("DC");
        }
        Employee( String name , String address , int number)
        {
            System.out.println("Constructing an employee ");
            this.name = name;
            this.address = address;
            this.number = number;
        }
        abstract double computePay();

            void mailcheck()
            {
                System.out.println("Mailing check to" + this.name + " " + this.address);
            }
        }

        class c1 extends Employee
        {
            @Override
            double computePay()
            {
                return 0;
            }
        }
    }
