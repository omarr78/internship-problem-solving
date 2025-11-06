package solutions_2025_10;


import java.util.*;

public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        for (int tci = 0; tci < tc; tci++) {
            int n = sc.nextInt();
            List<List<Integer>> list = new ArrayList<>();

            // get max array size
            Set<Integer> Allsizes = new TreeSet<>();
            int maxSize = 0;
            for (int i = 0; i < n; i++) {
                int siz = sc.nextInt();
                maxSize = Math.max(maxSize, siz);
                Allsizes.add(siz);
                List<Integer> addList = new ArrayList<>();
                for (int j = 0; j < siz; j++) {
                    addList.add(sc.nextInt());
                }
                list.add(addList);
            }
            int[] ans = new int[maxSize];
            Arrays.fill(ans, Integer.MAX_VALUE);
            int[] sizes = Allsizes.stream().mapToInt(i -> i).toArray();

            int startIdx;
            int endIdx = 0;
            for (int r = 0; r < sizes.length; r++) {
                startIdx = endIdx;
                endIdx = sizes[r];

                for (List checkList : list) {
                    // 0 means equal
                    // -1 ignore
                    // 1 put my values
                    int flag = 0;
                    for (int i = startIdx; i < endIdx; i++) {
                        if (flag == 0) {
                            if ((int) checkList.get(i) > ans[i]) {
                                flag = 1;
                            } else if ((int) checkList.get(i) < ans[i]) {
                                flag = -1;
                            }
                        } else if (flag == 1) {
                            ans[i] = (int) checkList.get(i);
                        } else { // -1
                            break;
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
