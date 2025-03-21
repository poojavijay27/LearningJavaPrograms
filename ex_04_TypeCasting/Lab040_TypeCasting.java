package ex_04_TypeCasting;

public class Lab040_TypeCasting {
    public static void main(String[] args)
    {
        long phone_no = 9848365149l;
     //    short  s  = phone_no;          // implicit
         short  s1 = (short) phone_no;   // Explicit Casting - Narrowing
        System.out.println(s1);
    }
}
