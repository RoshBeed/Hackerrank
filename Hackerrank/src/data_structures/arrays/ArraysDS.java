package data_structures.arrays;

import java.util.*;

public class ArraysDS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++)
            arr[arr_i] = in.nextInt();
        in.close();
        for(int arr_i=0; arr_i < n; arr_i++)
            System.out.print(arr[n - 1 - arr_i] + " ");
    }
}
