package algorithms.warmup;

import java.util.*;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++)
            arr[arr_i] = in.nextInt();
        in.close();
        for (int i = 0; i < 3; i++)
            System.out.println(Calc(arr)[i]);
    }
    public static float[] Calc(int[] a) {
        int count[] = new int[3];
        float result[] = new float[3];
        for (int i = 0; i < a.length; i++) 
            if (a[i] >= 1)
                count[0]++;
            else if (a[i] <= - 1)
                count[1]++;
            else
                count[2]++;
        for (int i = 0; i < 3; i++)
            result[i] = (float) count[i] / a.length;
        return result;
    }
}
