package CodeforcesRound1062Div4;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        for (int tci = 0; tci < tc; tci++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            boolean even = false;
            boolean odd = false;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] % 2 == 0) {
                    even = true;
                } else {
                    odd = true;
                }
            }
            if (even && odd) {
                Arrays.sort(a);
                for (int i : a) {
                    System.out.print(i + " ");
                }
                System.out.println();
            } else {
                for (int i : a) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }
}

