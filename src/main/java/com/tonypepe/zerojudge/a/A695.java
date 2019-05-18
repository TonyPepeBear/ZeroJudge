package com.tonypepe.zerojudge.a;

import java.util.Scanner;

public class A695 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long n = scanner.nextLong();
            long ans = 0;
            for (long i = n - 1; i > 0; i--) {
                if (n % i == 0) {
                    ans = i;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
