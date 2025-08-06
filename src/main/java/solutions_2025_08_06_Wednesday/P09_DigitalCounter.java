package solutions_2025_08_06_Wednesday;

import java.util.*;

public class P09_DigitalCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr = {2,7,2,3,3,4,2,5,1,2};
        String s = sc.next();
        int firstDigit = s.charAt(0) - '0';
        int secondDigit = s.charAt(1) - '0';

        System.out.println(arr[firstDigit]*arr[secondDigit]);

    }
}
