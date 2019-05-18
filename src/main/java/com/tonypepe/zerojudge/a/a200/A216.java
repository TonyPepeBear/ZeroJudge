package com.tonypepe.zerojudge.a.a200;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A216 {
    static Map<Integer, BigInteger> fNumber = new HashMap<>();
    static Map<Integer, BigInteger> gNumber = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println(f(n) + " " + g(n));
        }
    }

    static BigInteger f(int n) {
        if (n == 1) {
            return BigInteger.ONE;
        } else if (fNumber.containsKey(n)) {
            return fNumber.get(n);
        } else {
            BigInteger put = new BigInteger(String.valueOf(n)).add(f(n - 1));
            fNumber.put(n, put);
            return put;
        }
    }

    static BigInteger g(int n) {
        if (n == 1) {
            return BigInteger.ONE;
        } else if (gNumber.containsKey(n)) {
            return gNumber.get(n);
        } else {
            BigInteger put = f(n).add(g(n - 1));
            gNumber.put(n, put);
            return put;
        }
    }
}
