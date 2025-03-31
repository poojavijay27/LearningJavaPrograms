package ex_15_Arrays;

public class Lab119_Arrays {
    public static void main(String[] args)
    {
        int[] marks = { 88 ,94 ,87 ,92, 90};

        // 2nd way to create the array
        int[] mark2 = new int[5];   // Fixed Size
        int mark3[] = new int[5];   // Fixed Size
        mark2[0] = 88;
        mark3[1] = 77;
        mark2[2] = 99;
        System.out.println(mark3[1]);

        String[] names = new String[3];
        names[0]  = "sushanth";
        names[1]  = "shradda";
        names[2]  = "Rohit";
        System.out.println(names[0]);
        System.out.println(names[1]);
    }
}
