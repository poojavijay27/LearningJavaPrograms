package ex_15_Arrays;

public class Lab120_Arrays_Part2 {
    public static void main(String[] args)
    {
        String[] names = {"promod", "Amit", "Lucky"};
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);


        String[] names_atb11x = new String[3];
        names_atb11x[0] = "John";
        names_atb11x[1] = "sanvi";
        names_atb11x[2] = "Arya";
        System.out.println(names_atb11x[0]);
        System.out.println(names_atb11x[1]);
        System.out.println(names_atb11x[2]);

        boolean[] is_male_data = new boolean[2];
        is_male_data[0] = true;
        is_male_data[1] = false;
        System.out.println(is_male_data[0]);
        System.out.println(is_male_data[1]);
    }
}
