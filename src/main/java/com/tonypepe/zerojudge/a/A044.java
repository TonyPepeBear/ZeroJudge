package com.tonypepe.zerojudge.a;

import java.util.Scanner;

public class A044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println((n * n * n + 5 * n + 6) / 6);
        }
    }
}
