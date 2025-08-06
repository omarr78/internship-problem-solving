package solutions_2025_08_05_Tuesday;

import java.util.Scanner;

public class Boy_or_Girl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        int distinctCharCounter = 0;
        for(int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            boolean isDistinct = true;
            for(int j= i+1; j < username.length(); j++) {
                if(username.charAt(j) == ch) {
                    isDistinct = false;
                    break;
                }
            }
            if(isDistinct) {
                distinctCharCounter++;
            }
        }
        System.out.println(distinctCharCounter % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}
