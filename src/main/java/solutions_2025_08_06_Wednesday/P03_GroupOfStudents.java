package solutions_2025_08_06_Wednesday;

import java.util.Scanner;

public class P03_GroupOfStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int y = sc.nextInt();



        int result = -1;
        for(int rate = 0; rate <= 100; rate++){
            int beginner = 0;
            int intermediate = 0;
            for(int j = 0; j < n; j++){
                if(j < rate){
                    beginner+= arr[j];
                }
                else{
                    intermediate+= arr[j];
                }
            }
            if(((beginner >= x) && (beginner <= y)) && ((intermediate >= x) && (intermediate <= y))) {
                result = rate;
                break;
            }
        }
        System.out.println(result == -1 ? 0 : result+1);
    }
}
