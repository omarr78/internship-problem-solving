package solutions_2025_08_06_Wednesday;

import java.util.Scanner;

public class P04_Joysticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = 0;
        while(a > 0 && b > 0) {
            if(a == 1 && b == 1) {
                break;
            }
            if(a < b){
                a++;
                b-=2;
            }
            else{
                b++;
                a-=2;
            }
            min++;
        }
        System.out.println(min);

    }
}
