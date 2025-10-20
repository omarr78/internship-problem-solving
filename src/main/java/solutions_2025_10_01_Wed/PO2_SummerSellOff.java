package solutions_2025_10_01_Wed;

import java.util.Arrays;
import java.util.Scanner;

public class PO2_SummerSellOff {

    static class Solution {
        long x;
        long y;
        long sum;
        long result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,f;
        n = sc.nextInt();
        f = sc.nextInt();

        Solution[] arr = new Solution[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Solution();
            arr[i].x = sc.nextLong();
            arr[i].y = sc.nextLong();
            arr[i].sum = Math.min(arr[i].x,arr[i].y);
            if(arr[i].x >= arr[i].y){
                arr[i].result = 0;
            }
            else{
                long before = arr[i].sum;
                long after = Math.min(arr[i].x * 2, arr[i].y);
                arr[i].result = after - before;
            }
        }

        Arrays.sort(arr, (a, b) -> Long.compare(b.result, a.result));

        int count = 0;
        long ans = 0;
        for(Solution s : arr){
            if(count >= f){
                s.result = 0;
            }
            count++;
            ans+= s.sum + s.result;
        }

        System.out.println(ans);

    }


}
