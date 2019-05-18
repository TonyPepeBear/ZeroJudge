package com.tonypepe.zerojudge.b;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//66% TLE

public class B898 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println(Bi.answer(scanner.nextBigInteger(), scanner.nextBigInteger(), scanner.nextBigInteger()));
            }
        }
    }

    static class Bi {

        static BigInteger answer(BigInteger a, BigInteger b, BigInteger c) {
            ArrayList<BigInteger> bigIntegers = new ArrayList<>();
            bigIntegers.add(a);
            bigIntegers.add(b);
            bigIntegers.add(c);
            return Collections.max(bigIntegers);
        }
    }
}
