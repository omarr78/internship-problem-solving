package solutions_2025_10;

import java.util.Map;
import java.util.Scanner;

public class PO2_Keyboard {

    public static class Key {
        char ch;
        double x;
        double y;
    }

    public boolean isFound(Key[] keys, char ch ) {
        for (Key key : keys) {
            if (key.ch == ch) {
                return true;
            }
        }
        return false;
    }

    public void pre(double[] arr, Key[] keys){
        for(int i = 'a' ; i <= 'z' ; i++){
            double minDis = Double.MAX_VALUE;
            for(Key k: keys){
                if(k.ch == (char)i){
                    for(Key k2: keys){
                        if(k2.ch == 'S'){
                            double dis = calculateEuclideanDistance(k.x, k.y, k2.x, k2.y);
                            minDis = Math.min(dis, minDis);
                        }
                    }
                }
            }
            arr[i - 'a'] = minDis;
        }
    }

    public double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PO2_Keyboard _class = new PO2_Keyboard();

        int n, m;
        double x;

        n = sc.nextInt();
        m = sc.nextInt();
        x = sc.nextDouble();
        Key[] keys = new Key[n * m];
        double a = 0.5, b = 0.5;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                Key key = new Key();
                key.ch = s.charAt(j);
                key.x = a;
                key.y = b;
                keys[idx++] = key;
                b++;
            }
            b = 0.5;
            a++;
        }

        double []calculatedDist = new double[26];
        _class.pre(calculatedDist,keys);


        int counter = 0;
        boolean flag = true;
        int q = sc.nextInt();
        String s = sc.next();

        for (int i = 0; i < q; i++) {
            char c = s.charAt(i);

            if(Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
                if(!_class.isFound(keys, c) || !_class.isFound(keys, 'S')){
                    flag = false;
                    break;
                }

                if(calculatedDist[c - 'a'] > x){
                    counter++;
                }
            }
            else{
                if(!_class.isFound(keys, c)){
                    flag = false;
                    break;
                };
            }
        }

        if(flag){
            System.out.println(counter);
        }
        else{
            System.out.println(-1);
        }
    }
}
