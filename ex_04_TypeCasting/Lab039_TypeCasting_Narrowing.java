package ex_04_TypeCasting;

public class Lab039_TypeCasting_Narrowing {
    public static void main(String[] args)
    {
        int val = 100;
       // byte b  =  val;       // Invalid - Narrowing - Implicit Casting is not allowed.
        byte b1 = (byte) val;   // Valid - Narrowing - Explicit Casting - Allowed.
        System.out.println(b1);
    }
}
