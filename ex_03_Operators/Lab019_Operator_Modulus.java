package ex_03_Operators;

public class Lab019_Operator_Modulus {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        System.out.println(a%b);

        // Mod -> Remainder,
//        10 | 20 |  2 - Quoinet
//           | 20 |
//           -------
//             0 - Remainder
//           ----
        System.out.println(13%7);    /*   7 | 13 | 1 - Quotient
                                            |  7 |
                                            -------
                                        //     6 - Remainder
                                              ----             */
    }
}
