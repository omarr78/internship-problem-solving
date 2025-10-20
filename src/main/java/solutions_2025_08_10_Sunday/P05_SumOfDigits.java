package solutions_2025_08_10_Sunday;

import java.util.Scanner;

public class P05_SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String number = in.nextLine();
        int counter = 0;
        while(number.length() > 1) {
            counter++;
            int sum = 0;
            for(int i = 0;i< number.length();i++){
                sum+= number.charAt(i)-'0';
            }
            number = String.valueOf(sum);
        }
        System.out.println(counter);
    }
}
