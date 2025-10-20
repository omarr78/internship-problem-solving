package solutions_2025_10;

import java.util.Scanner;

public class P03_DreamoonAndWiFi {

    public boolean check_bit(int n,int bt)
    {
        if((n & (1 << bt)) != 0) return true;
        return false;
    }

    public StringBuilder[] generateProbabilities(int len){
        StringBuilder[] probs = new StringBuilder[(1 << len)];
        for(int i = 0 ; i < (1 << len); i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0 ; j < len; j++){
                if(check_bit(i,j)){
                    sb.append('+');
                }
                else{
                    sb.append('-');
                }
            }
            probs[i] = sb;
        }
        return probs;
    }

    public static void main(String[] args) {
        P03_DreamoonAndWiFi _class =new P03_DreamoonAndWiFi();
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        int sum1 = 0;

        for(int i = 0 ; i < s1.length(); i++){
            if(s1.charAt(i) == '+'){
                sum1++;
            }
            else{
                sum1--;
            }
        }

        int sum2 = 0;
        int unrecognized = 0;

        for(int i = 0 ; i < s2.length(); i++){
            if(s2.charAt(i) == '+'){
                sum2++;
            }
            else if(s2.charAt(i) == '-'){
                sum2--;
            }
            else{
                unrecognized++;
            }
        }

        if(unrecognized == 0){
            if(sum1 == sum2){
                System.out.printf("%.12f%n", (double) 1);
            }
            else{
                System.out.printf("%.12f%n", (double) 0);
            }
        }
        else{
            StringBuilder[] prob = _class.generateProbabilities(unrecognized);
            double cnt = 0;
            for(StringBuilder s: prob){
                int sum = 0;
                for(int j = 0 ; j < s.length(); j++){
                    if(s.charAt(j) == '+'){
                        sum++;
                    }
                    else{
                        sum--;
                    }
                }
                if(sum2 + sum == sum1){
                    cnt++;
                }
            }
            double ans = (cnt / ((double) (1 << unrecognized)));
            System.out.printf("%.12f%n", ans);
        }
    }
}
