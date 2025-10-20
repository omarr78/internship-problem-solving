package solutions_2025_08_10_Sunday;

import java.util.Scanner;

public class P02_BearAndFindingCriminals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int idx = in.nextInt() - 1;
        int [] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        int right = idx + 1;
        int left = idx - 1;

        int sum = 0;
        if(arr[idx]  == 1)sum = 1;
        while(right < N || left >= 0 ) {
            int l = -1;
            int r = -1;
            if(right < N){
                r = arr[right];
            }
            if(left >= 0){
                l = arr[left];
            }
            if(r == 1 && l == 1){
                sum+=2;
            }
            else if( (r == 1 && l == -1) || (l == 1 && r == -1)){
                sum+=1;
            }

            right++;
            left--;
        }
        System.out.println(sum);
    }
}
