package solutions_2025_08_10_Sunday;

import java.util.Scanner;

public class P09_EasterEggs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        n -= 7;
        StringBuilder ans = new StringBuilder("ROYGBIV");
        String s = "GBIV";

        int repeat = n / 4;
        int rem = n % 4;

        for (int i = 0; i < repeat; i++) {
            ans.append(s);
        }

        String restOfString = s.substring(0,rem);
        ans.append(restOfString);

        System.out.println(ans);

    }
}
