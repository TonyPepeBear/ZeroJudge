package com.tonypepe.zerojudge.d.d100;

import java.math.BigInteger;
import java.util.Scanner;

public class D124 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            BigInteger bigInteger = scanner.nextBigInteger();
            if (bigInteger.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}