package solutions_2025_08_05_Tuesday;

import java.util.Scanner;

public class Bear_and_Big_Brother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limakWeight, bobWeight;
        limakWeight = sc.nextInt();
        bobWeight = sc.nextInt();
        int counter = 0;
        while (limakWeight <= bobWeight) {
            limakWeight *= 3;
            bobWeight *= 2;
            counter++;
        }
        System.out.println(counter);
    }
}
