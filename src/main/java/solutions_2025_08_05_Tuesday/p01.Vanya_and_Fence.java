package solutions_2025_08_05_Tuesday;

import java.util.Scanner;

public class Vanya_and_Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,fenceHeight,sum=0;
        n = sc.nextInt();
        fenceHeight = sc.nextInt();
        for(int i = 0;i < n;i++){
            int height = sc.nextInt();
            if(fenceHeight >= height){
                sum++;
            }
            else{
                sum+=2;
            }
        }
        System.out.println(sum);
    }
}
