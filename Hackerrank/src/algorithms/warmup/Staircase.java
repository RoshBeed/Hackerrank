package algorithms.warmup;

import java.util.*;

public class Staircase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        Draw(n, ' ', '#');
    }
    public static void Draw(int n, char a, char b) {
        for (int i = 1; i < n + 1 ; i++) {
            for (int j = 0; j < n - i; j++)
                System.out.print(a);
            for (int j = 0; j < i; j++)
                System.out.print(b);
            System.out.println();
        }
    }
}
