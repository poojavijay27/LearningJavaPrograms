package ex_03_Operators;

public class Lab028_Interview {
    public static void main(String[] args) {

        int balaji_salary = 12;
        boolean b = !(balaji_salary > 10 || balaji_salary < 7 );
        System.out.println(b);

        // A - balaji_salary > 10 -> 12 > 10 -> true
        // B -> balaji_salary < 5  12 < 5 -> false
        // !(A || B) -> !(true || false) -> !true - false
    }
}

