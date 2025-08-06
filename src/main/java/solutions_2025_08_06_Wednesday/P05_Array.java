package solutions_2025_08_06_Wednesday;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> negative = new ArrayList<>();
        List<Integer> positive = new ArrayList<>();
        List<Integer> zero = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int inp = sc.nextInt();
            if(inp > 0) positive.add(inp);
            else if(inp < 0) negative.add(inp);
            else zero.add(inp);
        }

        int neg = negative.size(), pos = positive.size();


        if(pos == 0){
            positive.add(negative.getLast());
            negative.removeLast();
            positive.add(negative.getLast());
            negative.removeLast();
        }
        if(neg % 2 == 0){
            zero.add(negative.getLast());
            negative.removeLast();
        }

        System.out.print(negative.size() + " ");
        for(int i:negative) System.out.print(i+" ");

        System.out.println();

        System.out.print(positive.size() + " ");
        for(int i:positive) System.out.print(i+" ");

        System.out.println();

        System.out.print(zero.size() + " ");
        for(int i:zero) System.out.print(i+" ");

    }
}
