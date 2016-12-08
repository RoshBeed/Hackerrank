package tutorials.thirty_days_of_code;

import java.util.Scanner;

public class Day1DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";
        Scanner scan = new Scanner(System.in);
        int i_a = scan.nextInt();
        scan.nextLine();
        double d_a = scan.nextDouble();
        scan.nextLine();
        String s_a = scan.nextLine();
        System.out.println(i + i_a + "\n" + (d + d_a) + "\n" + s + s_a);
        scan.close();
    }
}
