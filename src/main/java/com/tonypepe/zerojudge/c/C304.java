package com.tonypepe.zerojudge.c;

import java.util.Scanner;

public class C304 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String words = scanner.next();
            long n = Long.valueOf(words);
            StringBuilder s = new StringBuilder(words);
            s.reverse();
            long m = Long.valueOf(s.toString());
            System.out.println(n + m);
        }
    }
}
