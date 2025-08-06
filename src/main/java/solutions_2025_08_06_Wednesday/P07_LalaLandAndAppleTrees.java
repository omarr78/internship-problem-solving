package solutions_2025_08_06_Wednesday;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class P07_LalaLandAndAppleTrees {
    public static class pair {
        int pos, apples;

        pair(int pos, int apples) {
            this.pos = pos;
            this.apples = apples;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<pair> right = new ArrayList<>();
        List<pair> left = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int position = sc.nextInt();
            int apple = sc.nextInt();
            if (position > 0) right.add(new pair(position, apple));
            if (position < 0) left.add(new pair(position, apple));
        }

        Comparator<pair> increasing = new Comparator<>() {
            @Override
            public int compare(pair a, pair b) {
                return a.pos - b.pos;
            }
        };

        Comparator<pair> descending = new Comparator<>() {
            @Override
            public int compare(pair a, pair b) {
                return b.pos - a.pos;
            }
        };

        right.sort(increasing);
        left.sort(descending);

        int res = 0;
        if(right.size() > left.size()){
            for(int i = 0 ; i < right.size() ; i++){
                res += right.get(i).apples;
                if(i < left.size()) res += left.get(i).apples;
                else break;
            }
        }
        else{
            for(int i = 0 ; i < left.size() ; i++){
                res += left.get(i).apples;
                if(i < right.size()) res += right.get(i).apples;
                else break;
            }
        }
        System.out.println(res);
    }
}
