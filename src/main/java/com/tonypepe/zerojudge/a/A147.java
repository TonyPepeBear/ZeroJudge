package com.tonypepe.zerojudge.a;

import java.util.Scanner;

public class A147 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n != 0) {
                for (int i = 1; i < n; i++) {
                    System.out.print((i % 7 == 0 ? "" : (i + " ")));
                }
                System.out.println();
            }
        }
    }
}
