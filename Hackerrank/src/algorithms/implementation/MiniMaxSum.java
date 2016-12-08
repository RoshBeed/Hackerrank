package algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;
    
public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] a = new long[5];
        long total = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = in.nextLong();
            total += a[i];
        }
        in.close();
        for (int i = 0; i < 5; i++)
            a[i] = total - a[i];
        Arrays.sort(a);
        System.out.println(a[0] + " " + a[a.length - 1]);
    }
}
