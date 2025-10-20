package solutions_2025_08_10_Sunday;

import java.util.Arrays;
import java.util.Scanner;

public class P13_KuriyamaMiraiStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int N = n + 1;
        long[] A = new long[N];
        long[] B = new long[N];

        for (int i = 1; i <= n; i++) {
            A[i] = sc.nextInt();
            B[i] = A[i];
        }

        Arrays.sort(B);

//        for(long a : A){
//            System.out.print(a + " ");
//        }
//        System.out.println();
//        for(long b : B){
//            System.out.print(b + " ");
//        }
//        System.out.println();


        for (int i = 1; i <= n; i++) {
            A[i] += A[i - 1];
            B[i] += B[i - 1];
        }

//        for(long a : A){
//            System.out.print(a + " ");
//        }
//        System.out.println();
//        for(long b : B){
//            System.out.print(b + " ");
//        }
//        System.out.println();



        int m = sc.nextInt();

        for(int i = 0 ; i < m; i++){
            int t = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            if(t == 1){
                System.out.println(A[r] - A[l - 1]);
            }
            else{
                System.out.println(B[r] - B[l - 1]);
            }
        }

    }
}
