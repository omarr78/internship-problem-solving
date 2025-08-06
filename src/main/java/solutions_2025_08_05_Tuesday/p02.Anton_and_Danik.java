package solutions_2025_08_05_Tuesday;
import java.util.Scanner;

public class Anton_and_Danik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String gamesPlayed;
        n = sc.nextInt();
        gamesPlayed = sc.next();
        int AntonScore = 0;
        int DanikScore = 0;
        for (int i = 0; i < n; i++) {
            if (gamesPlayed.charAt(i) == 'D') DanikScore++;
            else AntonScore++; // gamesPlayed.charAt(i) == 'A'
        }
        if (AntonScore > DanikScore) {
            System.out.println("Anton");
        } else if (AntonScore < DanikScore)
            System.out.println("Danik");
        else { // tie
            System.out.println("Friendship");
        }
    }
}
