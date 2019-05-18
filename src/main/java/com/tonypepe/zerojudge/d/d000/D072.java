package com.tonypepe.zerojudge.d.d000;

import java.util.Scanner;

public class D072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt(), c = i + 1;
                System.out.print("Case " + c + ": ");
                if (yearType(x)) {
                    System.out.println("a leap year");
                } else {
                    System.out.println("a normal year");
                }
            }
        }
    }

    private static boolean yearType(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else return year % 400 == 0;
    }
}
