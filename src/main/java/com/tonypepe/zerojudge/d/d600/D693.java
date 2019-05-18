package com.tonypepe.zerojudge.d.d600;

import java.util.Scanner;

public class D693 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            double a, ans = 1;
            for (int i = 0; i < n; i++) {
                a = scanner.nextDouble();
                ans = ans * a / gcd(a, ans);
            }
            System.out.println((int) ans);
        }
    }

    static double gcd(double a, double b) {
        if (a % b == 0)
            return b;
        else
            return gcd(b, a % b);
    }
}

