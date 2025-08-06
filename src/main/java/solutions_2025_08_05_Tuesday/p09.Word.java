package solutions_2025_08_05_Tuesday;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String lowerCase = s.toLowerCase();
        String upperCase = s.toUpperCase();
        int sameLowercase = 0;
        int sameUppercase = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==lowerCase.charAt(i)){
                sameLowercase++;
            }
            if(s.charAt(i)==upperCase.charAt(i)){
                sameUppercase++;
            }
        }
        if(sameLowercase >= sameUppercase){
            System.out.println(lowerCase);
        }
        else{
            System.out.println(upperCase);
        }
    }
}
