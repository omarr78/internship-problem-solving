package solutions_2025_08_10_Sunday;

import java.util.Scanner;

public class P06_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstLine = sc.nextLine();
        String secondLine = sc.nextLine();
        String thirdLine = sc.nextLine();
        String [] lines = {firstLine, secondLine, thirdLine};

        char first,op,second;
        int a = 0,b = 0 ,c = 0;
        for(int i = 0 ;i < 3;i++){
            first = lines[i].charAt(0);
            op = lines[i].charAt(1);
            second = lines[i].charAt(2);

            if(op == '>'){
                if(first == 'A'){
                    a++;
                }
                if(first == 'B'){
                    b++;
                }
                if(first == 'C'){
                    c++;
                }
            }
            else{
                if(second == 'A'){
                    a++;
                }
                if(second == 'B'){
                    b++;
                }
                if(second == 'C'){
                    c++;
                }
            }
        }
        if(a == b && b == c){
            System.out.println("Impossible");
        }
        else{
            if(a == 2) {
                if(b > c) System.out.println("CBA");
                else System.out.println("BCA");
            }
            else if(b == 2) {
                if(a > c) System.out.println("CAB");
                else System.out.println("ACB");
            }
            else {
                if(a > b) System.out.println("BAC");
                else System.out.println("ABC");
            }
        }
    }
}
