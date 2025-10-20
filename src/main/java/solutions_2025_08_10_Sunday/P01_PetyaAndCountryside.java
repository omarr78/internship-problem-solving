package solutions_2025_08_10_Sunday;


import java.util.Scanner;

public class P01_PetyaAndCountryside {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int maxSections = 1;
        for(int i = 0 ; i < N ; i++){
            int sectionCount = 1;
            int left = i-1;
            int right = i+1;
            int cur = arr[i];
            while(left >= 0 && arr[left] <= cur){
                cur = arr[left];
                sectionCount++;
                left--;
            }
            cur = arr[i];
            while(right < N && arr[right] <= cur){
                cur = arr[right];
                sectionCount++;
                right++;
            }
            maxSections = Math.max(maxSections, sectionCount);
        }
        System.out.println(maxSections);
    }
}
