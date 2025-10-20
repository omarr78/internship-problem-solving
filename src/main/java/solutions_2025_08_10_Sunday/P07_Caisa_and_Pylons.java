package solutions_2025_08_10_Sunday;

import java.util.Scanner;

public class P07_Caisa_and_Pylons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] N = new int[n];

        for (int i = 0; i < n; i++) {
            N[i] = sc.nextInt();
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, N[i]);
        }

        System.out.println(max);
    }
}
