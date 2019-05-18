package com.tonypepe.zerojudge.b;

import java.util.Scanner;

public class B676 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(WhoTeach.person(scanner.nextInt()));
        }
    }

    static class WhoTeach {
        private static String[] strings = {"U", "G", "Y", "T", "I"};

        static String person(int n) {
            return strings[n % 5];
        }
    }
}