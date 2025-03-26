package ex_12_Functions;

public class Lab100_Simple_Method {
    public static void main(String[] args) {

        f1();

        int i = return_int();
        System.out.println(i);

        boolean b = return_boolean();
        System.out.println(b);

        float f = return_float();
        System.out.println(f);

        String s =  retutn_string();
        System.out.println(s);
    }

    static void f1() {
        System.out.println("No return");
    }

    static int return_int() {
        return 10;
    }

    static boolean return_boolean() {
        return true;
    }

    static float return_float() {
        return 17.77f;
    }

    static long return_long() {
        return 10l;
    }
    static byte return_byte() {
        return 8;
    }
    static long retutn_long() {
        return 87l;
    }
    static String retutn_string() {
        return "divith";
    }
    static Character retutn_character() {
        return 'S';
    }
}