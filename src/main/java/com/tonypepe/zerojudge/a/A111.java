package com.tonypepe.zerojudge.a;

import java.util.Scanner;

public class A111 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                continue;
            }
            System.out.println(n * (n + 1) * (2 * n + 1) / 6);
        }
    }
}
