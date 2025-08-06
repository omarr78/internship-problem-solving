package solutions_2025_08_05_Tuesday;

import java.util.Scanner;

public class P13_PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int rec = 0;
        int crimeCounter = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == -1){
                if(rec > 0){
                    rec--;
                }
                else{
                    crimeCounter++;
                }
            }
            else{
                rec+= arr[i];
            }
        }
        System.out.println(crimeCounter);
    }
}
