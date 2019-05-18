package com.tonypepe.zerojudge.d.d400;

import java.util.Scanner;

public class D491 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt(), b = scanner.nextInt(), ans = 0;
            if (a > b) {
                int t = a;
                a = b;
                b = t;
            }
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    ans += i;
                }
            }
            System.out.println(ans);
        }
    }
}