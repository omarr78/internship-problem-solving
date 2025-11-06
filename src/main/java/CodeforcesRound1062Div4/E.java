package CodeforcesRound1062Div4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class E {

    static class Pair {
        long first, second;

        Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }

    static int n;
    static int k;
    static long x;
    static long[] arr;
    static List<Pair> ranges;

    public static boolean isValid(long mid) {
        long pointCnt = 0;
        if (arr[0] != 0) {
            long sum = arr[0] - mid;
            pointCnt += sum > 0 ? sum : 0;
        }
        if (arr[n - 1] != x) {
            long sum = x - (arr[n - 1] + mid);
            pointCnt += sum > 0 ? sum : 0;
        }
        for (int i = 1; i < n; i++) {
            // x1 ......  x2
            long x1 = arr[i - 1];
            long x2 = arr[i];
            long sum = x2 - (x1 + (2 * mid)) - 1;
            pointCnt += sum > 0 ? sum : 0;
        }
        return pointCnt >= k;
    }

    public static void generateRanges(long mid) {
        ranges = new ArrayList<>();
        // [start , end ] inclusive
        if (arr[0] != 0) {
            long sum = arr[0] - mid;
            if (sum > 0) {
                long start = 0;
                long end = arr[0] - mid - 1;
                Pair p = new Pair(start, end);
                ranges.add(p);
            }
        }
        for (int i = 1; i < n; i++) {
            // x1 ......  x2
            long x1 = arr[i - 1];
            long x2 = arr[i];
            long sum = x2 - (x1 + (2 * mid)) - 1;
            if (sum > 0) {
                long start = x1 + mid + 1;
                long end = x2 - mid - 1;
                Pair p = new Pair(start, end);
                ranges.add(p);
            }
        }
        if (arr[n - 1] != x) {
            long sum = x - (arr[n - 1] + mid);
            if (sum > 0) {
                long start = arr[n - 1] + mid + 1;
                long end = x;
                Pair p = new Pair(start, end);
                ranges.add(p);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int tci = 0; tci < tc; tci++) {

            n = sc.nextInt();
            k = sc.nextInt();
            x = sc.nextLong();

            // take an input
            arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            // then sort
            Arrays.sort(arr);

            // binary search
            long ans = -1;
            long l = 0, r = (int) 1e9 + 10;
            while (r >= l) {
                long m = (l + r) / 2;
                if (isValid(m)) {
                    ans = m;
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
//            System.out.print("** " + ans + " ** ");
            if (ans == -1) {
                int x1 = 0;
                for (int i = 0; i < k; i++) {
                    System.out.print(x1++ + " ");
                }
            } else {
                boolean found = false;
                int it = 0;
                generateRanges(ans);
                for (Pair p : ranges) {
                    for (long i = p.first; i <= p.second; i++) {
                        System.out.print(i + " ");
                        it++;
                        if (it >= k) {
                            found = true;
                            break;
                        }
                    }
                    if (found) break;
                }
            }
            System.out.println();
        }
    }
}
