package algorithms.warmup;
import java.util.Scanner;

public class SolveMeFirst {
    static int solveMeFirst1(int a, int b) {
        // Hint: Type return a+b; below
        return a + b;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[2];
        for (int i = 0; i < 2; i++)
            a[i] = in .nextInt(); in .close();
        System.out.println(solveMeFirst1(a[0], a[1]));
    }
}