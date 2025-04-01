package ex_15_Arrays;

public class Lab131_2D_Array_Iterate_For_Loop {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // 3x3
        // R -> 3
        // C -> 3

        // 1,2,3
        // 4,5,6
        // 7,8,9

       // for (int i = 0; i < matrix.length; i++) {          // 0 to 2  matrix.length - r
         //   for (int j = 0; j < matrix[i].length; j++) {   // matrix[i].length -> c
        //        System.out.println(matrix[i][j] + " ");
        //        System.out.println("*" + " ");
        //    }
         //   System.out.println();


        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " |");
        }
            System.out.println();
    }
}
}

