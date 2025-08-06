package solutions_2025_08_06_Wednesday;

import java.util.Scanner;

public class P01_VasyaAndDigitalRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int d = sc.nextInt();

        if(d == 0){
            if(k == 1){
                System.out.println(0);
            }
            else{
                System.out.println("No solution");
            }
        }

        else{
            System.out.print(d);
            for(int i = 0; i < k - 1; i++){
                System.out.print(0);
            }
        }
    }
}
