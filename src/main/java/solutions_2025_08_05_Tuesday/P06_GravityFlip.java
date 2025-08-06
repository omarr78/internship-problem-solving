package solutions_2025_08_05_Tuesday;

import java.util.Scanner;

class Gravity_Flip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfColumns = sc.nextInt();
        int[] columns = new int[numberOfColumns];
        for (int i = 0; i < numberOfColumns; i++) {
            columns[i] = sc.nextInt();
        }
        for (int i = numberOfColumns - 1; i >= 0; i--) {
            int idx = i;
            int maxVal = columns[i];

            for (int j = i - 1; j >= 0; j--) {
                if (columns[j] > maxVal) {
                    maxVal = columns[j];
                    idx = j;
                }
            }
            int rem = columns[idx] - columns[i];
            columns[i] += rem;
            columns[idx] -= rem;
        }
        for (int i = 0; i < numberOfColumns; i++) {
            System.out.print(columns[i]);
            if (i != numberOfColumns - 1) System.out.print(" ");
        }
    }
}
