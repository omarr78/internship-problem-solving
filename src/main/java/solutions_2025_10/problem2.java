package solutions_2025_10;

import java.sql.Array;
import java.util.*;

import static java.lang.Integer.min;
import static java.util.Arrays.sort;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[][] a = new int[n][];
            for (int i = 0; i < n; ++i) {
                int k = scanner.nextInt();
                a[i] = new int[k];
                for (int j = 0; j < k; ++j) {
                    a[i][j] = scanner.nextInt();
                }
            }
            ArrayList<Integer> order = new ArrayList<Integer>();
            for (int i = 0; i < n; ++i) {
                order.add(i);
            }
            int nextPos = 0;
            while (!order.isEmpty()) {
                int finalNextPos = nextPos;
                order.sort((i, j) -> {
                    int len = Integer.min(a[i].length, a[j].length);
                    for (int k = finalNextPos; k < len; ++k) {
                        if (a[i][k] != a[j][k]) {
                            return a[i][k] - a[j][k];
                        }
                    }
                    return a[i].length - a[j].length;
                });
                while (nextPos < a[order.getFirst()].length) {
                    System.out.print(a[order.getFirst()][nextPos] + " ");
                    nextPos++;
                }
                ArrayList<Integer> newOrder = new ArrayList<Integer>();
                for (int i : order) {
                    if (a[i].length > nextPos) newOrder.add(i);
                }
                order = newOrder;
            }
            System.out.println();
        }
    }
}
