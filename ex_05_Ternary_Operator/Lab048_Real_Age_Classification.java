package ex_05_Ternary_Operator;

public class Lab048_Real_Age_Classification
{
    public static void main(String[] args) {

        // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)
        // take an input from user

       String age1 = args[0];
       System.out.println(age1);
       System.out.println(age1 instanceof String);

        int age = Integer.parseInt(age1);
        String result = (age < 18)? " minor" : (age < 65) ? "Adult" : "senior";
        System.out.println(result);
    }
}