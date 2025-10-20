package solutions_2025_08_10_Sunday;

import java.util.Scanner;

public class P12_Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += A[i];
        }

        int mnIdx = 1;
        int mn = sum;
        int i = 0;
        int j = k;

        for (; j < n; i++, j++) {
            sum += A[j];
            sum -= A[i];
            if (mn > sum) {
//                System.out.println("ok" + i + " " + j);
                mnIdx = i + 2;
                mn = sum;
            }
        }
//        System.out.println(mn);
        System.out.println(mnIdx);
    }
}
