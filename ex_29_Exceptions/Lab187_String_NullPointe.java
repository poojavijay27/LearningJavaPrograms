package ex_29_Exceptions;

public class Lab187_String_NullPointe {
    public static void main(String[] args) {


        String name = null;
        name.trim();          // java.lang.NullPointerException
    }
}