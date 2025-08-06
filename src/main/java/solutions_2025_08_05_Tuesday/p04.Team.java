package solutions_2025_08_05_Tuesday;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int problems;
        problems = sc.nextInt();
        int writingProblemSolutionCounter = 0;
        for (int problem = 0; problem < problems; problem++) {
            int agreeCounter = 0;
            for (int participant = 0; participant < 3; participant++) {
                int agree = sc.nextInt();
                agreeCounter += agree;
            }
            if (agreeCounter >= 2) {
                writingProblemSolutionCounter++;
            }
        }
        System.out.println(writingProblemSolutionCounter);
    }
}
