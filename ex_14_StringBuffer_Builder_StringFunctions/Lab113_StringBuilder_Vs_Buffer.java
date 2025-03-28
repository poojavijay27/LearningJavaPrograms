package ex_14_StringBuffer_Builder_StringFunctions;

public class Lab113_StringBuilder_Vs_Buffer {
    public static void main(String[] args)
    {
        String s = "pooja";
        String s1 = new String("pooja");


        StringBuilder sb = new StringBuilder("shreya");
        StringBuffer sb1 = new StringBuffer("shreya");


        System.out.println(s);
        System.out.println(s1);
        System.out.println(sb);
        System.out.println(sb1);
    }
}
