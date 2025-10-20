package solutions_2025_10;

import java.util.Arrays;
import java.util.Scanner;

public class P01_MahmoudAndTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        boolean flag = false;
        for(int i = 2; i < n ; i++){
            if(a[i-1] + a[i-2] > a[i]){
                flag = true;
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
