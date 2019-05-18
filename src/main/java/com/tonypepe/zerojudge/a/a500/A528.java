package com.tonypepe.zerojudge.a.a500;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class A528 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            BigInteger[] bigIntegers = new BigInteger[n];
            for (int i = 0; i < n; i++) {
                bigIntegers[i] = scanner.nextBigInteger();
            }
            Arrays.sort(bigIntegers);
            for (int i = 0; i < n; i++) {
                System.out.println(bigIntegers[i]);
            }
        }
    }
}
