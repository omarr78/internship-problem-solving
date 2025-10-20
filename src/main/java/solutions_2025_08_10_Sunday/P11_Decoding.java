package solutions_2025_08_10_Sunday;

import java.util.Scanner;

public class P11_Decoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        StringBuilder ans = new StringBuilder();
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (n % 2 == 0) {
                if (flag) {
                    ans.insert(0, s.charAt(i));
                } else {
                    ans.append(s.charAt(i));
                }
                flag = !flag;
            } else {
                if (flag) {
                    ans.append(s.charAt(i));

                } else {
                    ans.insert(0, s.charAt(i));

                }
                flag = !flag;
            }
        }
        System.out.println(ans);
    }
}
