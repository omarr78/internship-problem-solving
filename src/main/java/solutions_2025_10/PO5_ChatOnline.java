package solutions_2025_10;

import java.util.Scanner;

public class PO5_ChatOnline {

    static final int N = 10000 + 5;

    static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p, q, l, r;

        p = sc.nextInt();
        q = sc.nextInt();
        l = sc.nextInt();
        r = sc.nextInt();

        int[] vis = new int[N];

        Pair[] z = new Pair[p];
        Pair[] x = new Pair[q]; // quite strange


        for (int i = 0; i < p; i++) {
            int f = sc.nextInt();
            int s = sc.nextInt();
            z[i] = new Pair(f, s);
        }

        for (int i = 0; i < q; i++) {
            int f = sc.nextInt();
            int s = sc.nextInt();
            x[i] = new Pair(f, s);
        }

        for (Pair p1 : z) {
            for (Pair p2 : x) {
                int end = p1.y - p2.x;
                int start = p1.x - p2.y;


                if (end < l || start > r) continue;

                start = Math.max(start, l);
                end = Math.min(end, r);

                vis[start]++;
                vis[end + 1]--;
            }
        }
        for (int i = 1; i <= 10000; i++) {
            vis[i] += vis[i - 1];
        }
        int cnt = 0;
        for (int i = l; i <= r; i++) {
            if (vis[i] > 0) cnt++;
//            System.out.println(vis[i]);
        }
        System.out.println(cnt);
    }
}
