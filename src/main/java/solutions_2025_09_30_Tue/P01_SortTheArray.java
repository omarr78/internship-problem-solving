package solutions_2025_09_30_Tue;



import java.util.Scanner;

public class P01_SortTheArray {

    public boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P01_SortTheArray _class = new P01_SortTheArray();

        int n = in.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }

        boolean dwn = false;
        int st = -1, end = -1;

        for (int i = 1; i < n; i++) {
            if(A[i] < A[i-1]){
                int j = i;
                dwn = true;
                st = j;
                while(j < n && A[j] < A[j-1]){
                    j++;
                }
                end = j;
            }
            if(dwn) break;
        }

        if (!dwn){
            System.out.println("yes");
            System.out.println(1 + " "  + 1);
        }

        else{
            // REVERSE

            int l = st - 1;
            int r = end - 1;

            while(r > l){
                int temp = A[l];
                A[l] = A[r];
                A[r] = temp;

                r--;
                l++;
            }

            if(_class.isSorted(A)){
                System.out.println("yes");
                System.out.println(st + " "  + end);
            }
            else{
                System.out.println("no");
            }
        }

    }

}
