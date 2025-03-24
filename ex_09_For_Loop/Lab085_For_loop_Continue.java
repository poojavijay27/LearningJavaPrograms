package ex_09_For_Loop;

public class Lab085_For_loop_Continue {
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            if (i == 5) {
                continue; //skip below code, move to top
            }
            System.out.println(i);
        }
    }
}