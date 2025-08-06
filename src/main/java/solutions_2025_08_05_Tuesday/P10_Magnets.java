package solutions_2025_08_05_Tuesday;

import java.util.Scanner;

class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        int counter = 1;
        String first = s[0];
        for (int i = 1; i < n; i++) {
            if (!first.equals(s[i])) {
                counter++;
                first = s[i];
            }
        }
        System.out.println(counter);
    }
}
