package ex_19_OOPs_Polymorphism.MethodOverLoading;

public class Lab155_Poly_MethodOverloading {
    public static void main(String[] args) {

        Mathoperations m1 = new Mathoperations();
        int r1 = m1.add(7, 6);
        int r2 = m1.add(5, 9, 7);
        double r3 = m1.add(8.87, 5.66);
        String r4 = m1.add("sushanth", "sanvi");
    }
}



