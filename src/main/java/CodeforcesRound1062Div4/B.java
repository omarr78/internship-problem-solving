package CodeforcesRound1062Div4;

import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        for (int tci = 0; tci < tc; tci++) {
            int n = sc.nextInt();
            char [] s = sc.next().toCharArray();
            char [] t = sc.next().toCharArray();
            Arrays.sort(s);
            Arrays.sort(t);
            boolean flag = true;
            for(int i = 0 ; i< n ; i++){
                if(s[i] != t[i]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
