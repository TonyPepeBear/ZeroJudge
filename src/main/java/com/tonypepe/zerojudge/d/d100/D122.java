package com.tonypepe.zerojudge.d.d100;

import java.util.Scanner;

public class D122 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long n = Long.valueOf(scanner.next()), sum = 0;
            do {
                n /= 5;
                sum += n;
            } while (n != 0);
            System.out.println(sum);
        }
    }
}