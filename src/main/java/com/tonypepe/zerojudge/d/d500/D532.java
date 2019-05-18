package com.tonypepe.zerojudge.d.d500;

import java.util.Scanner;

public class D532 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt(), b = scanner.nextInt();
            int ans = 0;
            for (int i = a; i < b + 1; i++) {
                if (Year.leapYear(i))
                    ans++;
            }
            System.out.println(ans);
        }
    }

    private static class Year {
        static boolean leapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    }
}