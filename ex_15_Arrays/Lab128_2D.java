package ex_15_Arrays;

public class Lab128_2D {
    public static void main(String[] args)
    {
        // 1,2,3
        // 4,5,6
        // 7,8,9

        int[][] array_2d = {{1,2,3},{4,5,6},{7,8,9}};


        int[][] predifined = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] array;
        array = new int[][] { {10,20},{30,40},{50,60}};
        // 10,20
        // 30,40
        // 50,60

        // R ->  3
        // C -> 3

        int[][] array2d = new int[3][3];
        array2d[0][0] = 2;
        array2d[0][1] = 7;
        array2d[0][2] = 8;
        System.out.println(array2d[0][1]);

        array2d[1][0] = 6;
        array2d[1][1] = 9;
        array2d[1][2] = 4;
        System.out.println(array2d[1][0]);

        array2d[2][0] = 8;
        array2d[2][1] = 6;
        array2d[2][2] = 9;
        System.out.println(array2d[2][0]);
        // 1 0,0
        //2	0,1
        //3	0,2
        //
        //4	1,0
        //5	1,1
        //6	1,2
        //
        //7	2,0
        //8	2,1
        //9	2,2


    }
}
