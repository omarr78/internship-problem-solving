package solutions_2025_10;


import java.util.*;

public class problem2 {

    public void sort(List<List<Integer>> list, int startIdx) {
        list.sort((o1, o2) -> {
            int size = Math.min(o1.size(), o2.size());
            for (int i = startIdx; i < size; i++) {
                int diff = o1.get(i) - o2.get(i);
                if (diff != 0) return diff;
            }
            return Integer.compare(o1.size(), o2.size());
        });
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        problem2 pro = new problem2();

        int tc = sc.nextInt();
        for(int tci = 0; tci < tc; tci++) {
            int n = sc.nextInt();
            List<List<Integer>> list = new ArrayList<>();

            // get max array size
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
            List<Integer> minList = new ArrayList<>();
            pro.sort(list, 0);

            while (minList.size() < maxSize) {
                int siz = list.getFirst().size();
                for(int i = 0 ; i < siz ; i++) {
                    minList.add(list.getFirst().get(i));
                }
                pro.sort(list, minList.size());
            }
            for(Integer i : minList) {
                System.out.print(i + " ");
            }
            System.out.println();

        }




    }

}
