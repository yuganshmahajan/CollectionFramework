package CollectionImpls;

import java.util.Scanner;

public class Array2DTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /**
         * Unlike C++ there is only one method in java to define a 2d array
         * this is equivalent to int **a = new int*[n];
         * for(int i = 0; i < n; i++){
         *  a[i] = new int[m];
         * }
         */
        int [][]a = new int[2][3];

        /**
         * To create a jaggered array
         * int[][] a = new int[2][]; // 2d array with 2 rows and cols not defined yet
         * a[0] = new int[3]; // first row with 3 columns
         * a[1] = new int[4]; // second row with 4 columns
          */


        //Take Input
        for(int i = 0 ; i < 2; i++){
            for(int j = 0; j < 3; j++){
                a[i][j] = scn.nextInt();
            }
        }

        //Print 2d array
        for(int i = 0 ; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
