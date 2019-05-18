package com.tonypepe.zerojudge.d.d100;

import java.util.Scanner;

public class D127 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long n = Long.valueOf(scanner.next());
            n /= 2;
            if (n % 2 == 0) {
                n /= 2;
                System.out.println((n * n));
            } else {
                long max = 0;
                for (long i = 1; i < n / 2 + 1; i++) {
                    if (max < (i * (n - i))) {
                        max = (i * (n - i));
                    }
                }
                System.out.println(max);
            }
        }
    }
}