package data_structures.arrays;

import java.util.*;

public class Array2DDS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
            int[][] hourglass_sums = new int[4][4];
            for (int i = 0; i < 4; i ++) {
                for (int j = 0; j < 4; j++) {
                    hourglass_sums[i][j] = arr[ i ][ j ] + arr[ i ][j+1] + arr[ i ][j+2] + 
                                                           arr[i+1][j+1] + 
                                           arr[i+2][ j ] + arr[j+2][j+1] + arr[i+2][j+2];
                    
                }
            }
            int[] sums = new int[hourglass_sums.length * hourglass_sums.length];
            for (int i = 0; i < hourglass_sums.length - 1; i++) {
                for (int j = 0; j < hourglass_sums[i].length - 1; j++) {
                    sums[(i * hourglass_sums.length) + hourglass_sums.length] = hourglass_sums[i][j];
                }
            }
            Arrays.sort(sums);
            System.out.println(sums[sums.length - 1]);
        in.close();
        }
    }
}
