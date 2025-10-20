package solutions_2025_09_29_Mon;


import java.util.Scanner;

public class P02_LovelyPalindromes {


    public boolean isPalindrome(StringBuilder s) {
        StringBuilder s1 = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            s1.append(s.charAt(i));
        }
        return s.compareTo(s1) == 0;
    }

    public void explorePattern() {

        int n = 0;
        int count = 1;

        while (n < 1000005) {


            StringBuilder s = new StringBuilder(String.valueOf(n));

            if (s.length() % 2 == 0) {
                if (isPalindrome(s)) {
                    System.out.println(count + " " + s);
                    System.out.println();
                    count++;
                }
            }

            n++;
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P02_LovelyPalindromes _class = new P02_LovelyPalindromes();

        String num = in.nextLine();

        StringBuilder ans = new StringBuilder();

        for(int i = num.length() - 1; i >= 0 ; i--){
            ans.append(num.charAt(i));
            ans.insert(0,num.charAt(i));
        }

        System.out.println(ans);
    }
}
