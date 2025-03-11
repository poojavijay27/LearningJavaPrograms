package ex_01_Java_Basics;

public class Lab007_printf {
    public static void main(String[] args) {

        int a = 10;
        System.out.printf("You variable is %d", a);

        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean

        int b = 20;
        System.out.println(" --- ");
        System.out.printf("%d + %d", a, b);

    }
    }
