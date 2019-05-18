package com.tonypepe.zerojudge.a.a600;

import java.util.Scanner;

public class A686 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                Snail.snail(scanner.nextInt(),
                        scanner.nextInt(),
                        scanner.nextInt());
            }
        }
    }

    static class Snail {
        static void snail(int x, int y, int z) {
            int ans = 0;
            if (z >= y && x > y) {
                System.out.println("Poor Snail");
                return;
            }
            while (x > 0) {
                ans++;
                x = x - y;
                if (x <= 0) {
                    break;
                }
                x += z;
            }
            System.out.println(ans);
        }
    }
}
