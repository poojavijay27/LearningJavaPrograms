package ex_15_Arrays;

public class Lab122_Arrays_Max_Min {
    public static void main(String[] args) {

        int[] array = {88, 93, 79, 66, 84, 67, 96, 95, 77, 89};
        // Can we take the the input from user also? = Yes - later
        // Max and Min

        // Max

        int max_output = give_me_max(array);
        // int min_output = give_me_min(array);
        System.out.println(max_output);
        //System.out.println(min_output);
    }

    static int give_me_max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}

