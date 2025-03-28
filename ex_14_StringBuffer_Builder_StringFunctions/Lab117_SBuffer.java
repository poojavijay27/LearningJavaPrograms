package ex_14_StringBuffer_Builder_StringFunctions;

public class Lab117_SBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("java");
        sb.append("programming");
        System.out.println(sb);
        sb.delete(4,16);
        System.out.println(sb);
        sb.replace(0,4,"language");
        System.out.println(sb);
    }
}
