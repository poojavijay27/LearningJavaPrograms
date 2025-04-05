package ex_19_OOPs_Polymorphism.MethodOverLoading;

class Mathoperations {
    // In the same class, When you have a method wit same
    // name but different arguments and different return type.

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}
