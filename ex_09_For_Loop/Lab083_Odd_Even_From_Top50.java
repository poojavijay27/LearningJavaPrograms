package ex_09_For_Loop;

public class Lab083_Odd_Even_From_Top50 {
    public static void main(String[] args) {
        // TO find the even numbers from 1 to 50
        // even -> i%2 ==0
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even->" + i);

          // odd -> i%2 ==1
                for (int i1 = 0; i1 <= 50; i1++) {
                    if (i1 % 2 == 1) {
                        System.out.println("odd->" + i1);
                    }
                }
            }
        }
    }
}