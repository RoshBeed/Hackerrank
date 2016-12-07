package algorithms.warmup;

import java.util.*;

public class CompareTheTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] alice_score = new int[3];
        int[] bob_score = new int[3];
        int alice_count = 0;
        int bob_count = 0;
        for (int i = 0; i < 3; i++)
            alice_score[i] = in.nextInt();
        for (int i = 0; i < 3; i++)
            bob_score[i] = in.nextInt();
        for (int i = 0; i < 3; i++) {
            if (alice_score[i] > bob_score[i])
                alice_count++;
            else if (bob_score[i] > alice_score[i])
                bob_count++;
        }
        in.close();
        System.out.print(alice_count + " " + bob_count);
    }
}