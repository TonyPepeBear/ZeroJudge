package com.tonypepe.zerojudge.d.d000;

import java.util.Scanner;

public class D071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(yearType(scanner.nextInt()) ? "a leap year" : "a normal year");
        }
    }

    private static boolean yearType(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else return year % 400 == 0;
    }
}
