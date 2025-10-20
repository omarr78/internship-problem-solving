package solutions_2025_09_29_Mon;


import java.util.Scanner;

public class P01_PresidentsOffice {

    StringBuilder allChar = new StringBuilder();

    public void handleAllChars(char x){

        boolean ch = true;

        for(int i = 0 ; i < allChar.length() ; i++) {
            if (allChar.charAt(i) == x) {
                ch = false;
                break;
            }
        }
        if(ch){
            allChar.append(x);
        }

    }

    public static void main(String[] args) {
        P01_PresidentsOffice _class = new P01_PresidentsOffice();
        Scanner in = new Scanner(System.in);
        int n,m;

        n = in.nextInt();
        m = in.nextInt();

        char p = in.next().charAt(0);
        in.nextLine();



        char[][] a = new char[n][m];

        for(int i = 0 ; i < n ; i++){
            String row = in.nextLine();
            for(int j = 0 ; j < m ; j++){
                a[i][j] = row.charAt(j);
            }
        }

        for(int i  = 0 ; i< n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(a[i][j] == p){
                    // up
                    if(i - 1 >= 0 && a[i-1][j] != p && a[i-1][j] != '.'){
                        _class.handleAllChars(a[i-1][j]);
                    }

                    // down

                    if(i + 1 < n && a[i+1][j] != p && a[i+1][j] != '.'){
                        _class.handleAllChars(a[i+1][j]);
                    }

                    // left

                    if(j - 1 >= 0 && a[i][j-1] != p && a[i][j-1] != '.'){
                        _class.handleAllChars(a[i][j-1]);
                    }

                    // right

                    if(j + 1 < m && a[i][j+1] != p && a[i][j+1] != '.'){
                        _class.handleAllChars(a[i][j+1]);
                    }
                }
            }
        }

        System.out.println(_class.allChar.length());


    }
}
