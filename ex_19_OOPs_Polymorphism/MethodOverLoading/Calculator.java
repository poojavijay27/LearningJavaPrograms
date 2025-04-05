package ex_19_OOPs_Polymorphism.MethodOverLoading;

public class Calculator {

    int attribute;

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

public static void main(String[] args) {
    Calculator c1 = new Calculator();
    c1.add(7, 9);
    c1.add(9.77, 7.55);
}
}