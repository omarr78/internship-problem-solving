package solutions_2025_08_05_Tuesday;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P12_StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!list.isEmpty()) {
                if (list.getLast() != s.charAt(i)) {
                    list.add(s.charAt(i));
                }
            } else {
                list.add(s.charAt(i));
            }
        }
        System.out.println(n - list.size());
    }
}
