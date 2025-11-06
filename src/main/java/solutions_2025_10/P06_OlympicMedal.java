package solutions_2025_10;

import java.util.Scanner;

public class P06_OlympicMedal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] r1 = new int[n];
        int maxR1 = 0;
        for(int i =0 ; i<n;i++){
            r1[i] = s.nextInt();
            maxR1=Math.max(maxR1,r1[i]);
        }
        int m = s.nextInt();
        int[] p1 = new int[m];
        int maxP1 = 0;
        for(int i =0 ; i<m;i++){
            p1[i] = s.nextInt();
            maxP1=Math.max(maxP1,p1[i]);
        }
        int z = s.nextInt();
        int[] p2 = new int[z];
        int minP2= s.nextInt();
        for(int i =1 ; i<z;i++){
            p2[i] = s.nextInt();
            minP2=Math.min(minP2,p2[i]);
        }
        int A = s.nextInt();
        int B = s.nextInt();
        double ans = (double) B * maxP1 / ((maxP1 * B) + (A * minP2));
        double value = maxR1 * Math.sqrt(ans);
        System.out.println(value);
    }
}
