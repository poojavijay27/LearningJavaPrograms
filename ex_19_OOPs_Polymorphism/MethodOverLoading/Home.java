package ex_19_OOPs_Polymorphism.MethodOverLoading;

class Home {


    void task(int a) {
        System.out.println(a);
    }

    void task(int a, int b) {
        System.out.println(a + b);
    }

    void task(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
