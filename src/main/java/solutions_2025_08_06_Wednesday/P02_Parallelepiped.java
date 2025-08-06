package solutions_2025_08_06_Wednesday;

import java.util.Scanner;

public class P02_Parallelepiped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long area1 = sc.nextInt();
        long area2 = sc.nextInt();
        long area3 = sc.nextInt();

        long mul = area1*area2*area3;
        long squareRoot = (long)Math.sqrt(mul);

        long a = squareRoot/area1;
        long b = squareRoot/area2;
        long c = squareRoot/area3;

        System.out.println(a*4 + b*4 + c*4);
    }
}
