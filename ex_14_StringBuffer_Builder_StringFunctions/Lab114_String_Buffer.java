package ex_14_StringBuffer_Builder_StringFunctions;

public class Lab114_String_Buffer {
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("pooja");
        sb.append("vijay");
        System.out.println(sb);
        System.out.println(sb.reverse());

        String s1 = "kavya";
        String s2 = "yashu";
        String s3 = s1+s2;
        System.out.println(s3);
        System.out.println(s1);
    }
}
