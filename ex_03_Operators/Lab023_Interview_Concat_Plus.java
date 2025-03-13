package ex_03_Operators;

public class Lab023_Interview_Concat_Plus {
    public static void main(String[] args)
    {
        String First_Name = "Pooja";
        String last_Name  = "Vijay";

        int a = 10;
        int b = 20;
        System.out.println(First_Name+last_Name +a+b);
        // // PramodDutta1010 - first operator - + performed as Concatenation


        System.out.println(a+b+First_Name+last_Name);

        System.out.println(First_Name+last_Name +(a+b));
        // BODMAS - Bracket of Div, mul, add, sub



    }

}
