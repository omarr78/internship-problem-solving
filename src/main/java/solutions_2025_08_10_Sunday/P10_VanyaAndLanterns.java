package solutions_2025_08_10_Sunday;

import java.util.Scanner;
import java.util.Arrays;


public class P10_VanyaAndLanterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long l = sc.nextLong();

        long[] A = new long[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        double mx = A[0];
        for (int i = 1; i < n; i++) {
            mx = Math.max(mx, ((double) A[i] - (double) A[i - 1]) / 2);
        }
        mx = Math.max(mx, l - A[n - 1]);
        System.out.printf("%.10f%n", mx);


    }
}
