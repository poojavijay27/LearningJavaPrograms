package ex_01_Java_Basics;

public class Lab011_printf {
    public static void main(String[] args) {

        int table = 9;
        System.out.println("Multiplication Table of " +table +":");
        System.out.printf("%d*1=%d%n" ,table ,(table ));
        System.out.printf("%d*2=%d%n",table ,(table *2));
        System.out.printf("%d*3=%d%n",table ,(table *3));
        System.out.printf("%d*4=%d%n",table ,(table*4));
        System.out.printf("%d*5=%d%n",table,(table*5));
        System.out.printf("%d*6=%d%n",table,(table*6));
        System.out.printf("%d*7=%d%n",table,(table*7));
        System.out.printf("%d*8=%d%n",table,(table*8));
        System.out.printf("%d*9=%d%n",table,(table*9));
        System.out.printf("%d*10=%d%n",table,(table*10));
    }
}

