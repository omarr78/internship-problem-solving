package solutions_2025_08_05_Tuesday;

import java.util.Scanner;

class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();
        int result = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) > s2.charAt(i)) {
                result = 1;
                break;
            } else if (s1.charAt(i) < s2.charAt(i)) {
                result = -1;
                break;
            }
        }
        System.out.println(result);
    }
}
