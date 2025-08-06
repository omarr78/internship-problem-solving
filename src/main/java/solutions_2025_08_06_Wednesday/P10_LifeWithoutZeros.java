package solutions_2025_08_06_Wednesday;

import java.util.Scanner;

public class P10_LifeWithoutZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        long res1 = a + b;

        String firstNumber = Integer.toString(a);
        String secondNumber = Integer.toString(b);
        String firstResult = Long.toString(res1);

        String firstNumberWithoutZero = "";
        String secondNumberWithoutZero = "";
        String firstResultWithoutZero = "";

        for(int i = 0; i < firstNumber.length(); i++) {
            if (firstNumber.charAt(i) != '0') {
                firstNumberWithoutZero += firstNumber.charAt(i);
            }
        }
        for(int i = 0; i < secondNumber.length(); i++) {
            if(secondNumber.charAt(i) != '0') {
                secondNumberWithoutZero += secondNumber.charAt(i);
            }
        }
        for(int i = 0 ; i < firstResult.length(); i++) {
            if(firstResult.charAt(i) != '0') {
                firstResultWithoutZero += firstResult.charAt(i);
            }
        }

        int aa = Integer.parseInt(firstNumberWithoutZero);
        int bb = Integer.parseInt(secondNumberWithoutZero);
        long res2 = Long.parseLong(firstResultWithoutZero);

        if(a + b == res1 && aa + bb == res2) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
