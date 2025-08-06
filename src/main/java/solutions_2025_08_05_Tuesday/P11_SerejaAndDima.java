package solutions_2025_08_05_Tuesday;

import java.util.Scanner;


public class P11_SerejaAndDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum1 = 0,sum2 = 0;
        int i = 0, j = n-1;
        boolean flag = true;
        while(j >= i){
            if(arr[i] > arr[j]){
                if(flag)sum1 += arr[i];
                else sum2 += arr[i];
                i++;
            }
            else{
                if(flag)sum1 += arr[j];
                else sum2 += arr[j];
                j--;
            }
            flag = !flag;
        }
        System.out.println(sum1 + " " + sum2);
    }
}
