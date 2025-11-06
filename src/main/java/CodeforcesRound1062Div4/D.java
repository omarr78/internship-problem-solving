package CodeforcesRound1062Div4;

import java.util.Scanner;

public class D {

    public static long findGCD(long a, long b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int tci = 0; tci < tc; tci++) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();

            boolean found = false;
            for (long i = 2; i < 1000; i++) {
                for (int j = 0; j < n; j++) {
                    if (findGCD(i, a[j]) == 1) {
                        System.out.println(i);
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
            if (!found) {
                System.out.println(-1);
            }
        }
    }
}
