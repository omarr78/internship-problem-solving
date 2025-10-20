package solutions_2025_08_10_Sunday;

import java.util.Scanner;

public class P08_EffectiveApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = (int) 1e5 + 5;
        int[] regular = new int[N];
        int[] reverse = new int[N];

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            regular[arr[i]] = i + 1;
        }

        for(int i = n - 1, j = 0; i >= 0; i--, j++){
            reverse[arr[i]] = j + 1;
        }

        long sum1 = 0, sum2 = 0;

        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            int inp = sc.nextInt();
            sum1 += regular[inp];
            sum2 += reverse[inp];
        }
        System.out.println(sum1 + " " + sum2);

    }
}
