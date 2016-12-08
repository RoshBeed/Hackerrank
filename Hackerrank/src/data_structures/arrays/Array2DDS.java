package data_structures.arrays;

import java.util.*;

public class Array2DDS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = GetArr();
        int max_glass = GetHourglassMax(arr);
        System.out.println(max_glass);
        in.close();
    }
    public static int GetHourglassMax(int[][] a) {
        int[] hourglass = new int[16];
        int x = 0;
        for (int i = 0; i < 4; i ++) 
            for (int j = 0; j < 4; j++) {
                hourglass[x] = a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+1] + a[i+2][j] + a[j+2][j+1] + a[i+2][j+2];
                System.out.println("hourglass: " + hourglass[x]);
                x++;
            }
        Arrays.sort(hourglass);
        return hourglass[hourglass.length - 1];
    }
    public static int[][] GetArr() {
        Scanner in = new Scanner(System.in);
        int a[][] = new int[6][6];
        for(int i = 0; i < 6; i++)
            for(int j = 0; j < 6; j++)
                a[i][j] = in.nextInt();
        in.close();
        return a;
    }
}
