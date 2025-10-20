package solutions_2025_10;

import java.util.*;

public class P04_StudentsAndShoelaces {

    final static int N = 100 + 5;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer>[] students = new Set[N];

        for (int i = 0; i < N; i++) {
            students[i] = new TreeSet<>();
        }

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int inp1 = sc.nextInt();
            int inp2 = sc.nextInt();

            students[inp1].add(inp2);
            students[inp2].add(inp1);
        }

        int cnt = 0;

        while (true) {
            boolean flag = true;
            List<Integer> nums = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (students[i].size() == 1) {
                    nums.add(i);
                }
            }

            for (int i : nums) {
                flag = false;
                Optional<Integer> op = students[i].stream().findFirst();
                if (op.isPresent()) {
                    students[i].remove(op.get());
                    students[op.get()].remove(i);
                }
            }
            if (flag) break;
            cnt++;
        }
        System.out.println(cnt);


    }
}
