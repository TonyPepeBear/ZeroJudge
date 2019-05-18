package com.tonypepe.zerojudge.a.a700;

import java.util.Scanner;

public class A740 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println(calculator(n));
        }
    }

    private static int calculator(int n) {
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0 && n > 0) {
                n /= i;
                ans += i;
            }
        }
        return ans;
    }
}
