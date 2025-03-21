package ex_05_Ternary_Operator;

public class Lab044_Interview_Ready_Question {

    public static void main(String[] args) {

        // Nested Ternary

        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

        int num = 27;
        String result = (num > 9) ? (num > 10 ? "N>10" : "N<10") : "B";
        System.out.println(result);
    }

}
