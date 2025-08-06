package solutions_2025_08_06_Wednesday;

import java.util.Scanner;

public class P06_RoundHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int house = sc.nextInt();
        int dist = sc.nextInt();

        int equation = ((dist % n)+ n) + house;
        System.out.println(equation % n == 0 ? n : equation % n);
    }
}
