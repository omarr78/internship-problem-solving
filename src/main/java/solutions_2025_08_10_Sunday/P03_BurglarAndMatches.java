package solutions_2025_08_10_Sunday;


import java.util.*;

public class P03_BurglarAndMatches {
    public static class Pair{
        int f,s;

        Pair(int f, int s) {
            this.f = f;
            this.s = s;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

//        List<Pair> list = new ArrayList<>();

        Pair [] pairs = new Pair[m];

        for(int i = 0 ; i < m ; i++){
//            list.add(new Pair(sc.nextInt(), sc.nextInt()));
            pairs[i] = new Pair(sc.nextInt(), sc.nextInt());
        }

        Comparator<Pair> descending = new Comparator<>() {
            @Override
            public int compare(Pair a, Pair b) {
                return Integer.compare(b.s, a.s);
            }
        };

        Arrays.sort(pairs, descending);

        int sum = 0;
        int rem = n;
        for(int i=0;i<pairs.length;i++){
            if(rem >= pairs[i].f){
                sum += pairs[i].f * pairs[i].s;
                rem -= pairs[i].f;
            }
            else{
                sum += rem * pairs[i].s;
                break;
            }
        }
        System.out.println(sum);

    }
}
