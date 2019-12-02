package com.tonypepe.zerojudge.c;

import java.util.Scanner;

public class C002 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) break;
            System.out.println("f91(" + n + ") = " + f91(n));
        }
    }

    private static int f91(int n) {
        if (n < 101) return f91(f91(n + 11));
        else return n - 10;
    }
}
