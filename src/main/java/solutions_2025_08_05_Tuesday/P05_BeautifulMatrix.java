package solutions_2025_08_05_Tuesday;

import java.util.Scanner;

class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[][] matrix = new int[size][size];
        int oneRow = 0, oneCol = 0;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[row][col] = sc.nextInt();
                if (matrix[row][col] == 1) {
                    oneRow = row;
                    oneCol = col;
                }
            }
        }
        int middle = 2;
        int moves = Math.abs(oneRow - middle) + Math.abs(oneCol - middle);
        System.out.println(moves);
    }
}
