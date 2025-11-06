package solutions_2025_10;


import java.util.*;

public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        for (int tci = 0; tci < tc; tci++) {
            int n = sc.nextInt();
            List<List<Integer>> list = new ArrayList<>();
            int maxSize = 0;
            for (int i = 0; i < n; i++) {
                int siz = sc.nextInt();
                maxSize = Math.max(maxSize, siz);
                List<Integer> addList = new ArrayList<>();
                for (int j = 0; j < siz; j++) {
                    addList.add(sc.nextInt());
                }
                list.add(addList);
            }
            list.sort(Comparator.comparingInt(List::size));
            int[] ans = new int[maxSize];
            Arrays.fill(ans, Integer.MAX_VALUE);

            Set<Integer> checkpoints = new TreeSet<>();
            int cntSz = 0;

            for (List<Integer> arr : list) {
                checkpoints.add(cntSz);
                boolean isBest = false;
                int flag = 0;
                for (int i = 0; i < arr.size(); i++) {
                    if(checkpoints.isEmpty()){
                        checkpoints.add(0);
                    }
                    if (checkpoints.contains(i)) {
                        if (flag == -1) {
                            flag = 0;
                        }
                    }
                    // 0 means equal
                    // -1 ignore
                    // 1 put my values, or isBest = true
                    if (isBest) {
                        if (ans[i] == Integer.MAX_VALUE) cntSz++;
                        else{
                            Iterator<Integer> it = checkpoints.iterator();
                            while (it.hasNext()) {
                                if (it.next() > i){
                                    it.remove();
                                }
                            }
                        }
                        ans[i] = arr.get(i);
                    } else {
                        if (flag == 0) {
                            if (arr.get(i) < ans[i]) {
                                if (ans[i] == Integer.MAX_VALUE) cntSz++;
                                else{
                                    Iterator<Integer> it = checkpoints.iterator();
                                    while (it.hasNext()) {
                                        if (it.next() > i){
                                            it.remove();
                                        }
                                    }
                                }
                                ans[i] = arr.get(i);
                                flag = 1;
                                isBest = true;
                            } else if (arr.get(i) > ans[i]) {
                                flag = -1;
                            }
                        } else if (flag == 1) {
                            if (ans[i] == Integer.MAX_VALUE) cntSz++;
                            else{
                                Iterator<Integer> it = checkpoints.iterator();
                                while (it.hasNext()) {
                                    if (it.next() > i){
                                        it.remove();
                                    }
                                }
                            }
                            ans[i] = arr.get(i);
                        }
                    }
                }
            }
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

// test cases to cover
/*
=== INPUT ===

1
5
3 2 2 8
4 2 3 6 4
2 5 1
2 2 3
3 4 8 1

=== ACCEPTED OUTPUT ===
2 2 8 4
=== WRONG OUTPUT ===
2 2 1 4

================================================

=== INPUT ===

1
4
2 5 1
1 5
5 7 6 3 7 9
3 8 2 9

=== ACCEPTED OUTPUT ===
5 1 3 7 9
=== WRONG OUTPUT ===
5 1 9 7 9

=================================================

=== INPUT ===
1
5
4 6 9 4 7
1 8
1 3
4 6 8 8 2
4 6 6 6 8

=== ACCEPTED OUTPUT ===
3 6 6 8
=== WRONG OUTPUT ===
3 8 8 2

================================================

=== INPUT ===
1
5
5 9 7 4 9 7
4 4 5 8 1
2 1 5
5 2 7 7 1 4
3 8 9 6

=== ACCEPTED OUTPUT ===
1 5 4 9 7
=== WRONG OUTPUT ===
1 5 4 1 4

*/

