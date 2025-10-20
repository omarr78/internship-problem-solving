package solutions_2025_10_01_Wed;


import java.util.Arrays;
import java.util.Scanner;

public class P01_ColorfulField {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, m, k, q;

        n = in.nextInt();
        m = in.nextInt();
        k = in.nextInt();
        q = in.nextInt();

        int[] wasteCell = new int[k];

        for (int i = 0; i < k; i++) {
            int x, y;
            x = in.nextInt();
            y = in.nextInt();
            x--;y--;
            wasteCell[i] = x * m + y;
        }

        Arrays.sort(wasteCell);

        for (int i = 0; i < q; i++) {
            int x, y;
            x = in.nextInt();
            y = in.nextInt();
            x--;y--;
            int pos = x * m + y;

            int count = 0;

            boolean found = false;

            for (int j = 0; j < k; j++) {
                if(wasteCell[j] < pos)count++;
                else if(wasteCell[j] == pos){
                    System.out.println("Waste");
                    found = true;
                }
                else break;
            }

            if(!found){
                int cal = (pos - count) % 3;

                if(cal == 0){
                    System.out.println("Carrots");
                }
                else if(cal == 1){
                    System.out.println("Kiwis");
                }
                else{
                    System.out.println("Grapes");
                }
            }
        }
    }

}
