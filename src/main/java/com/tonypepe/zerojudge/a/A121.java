package com.tonypepe.zerojudge.a;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A121 {
    private static Prime prime = new Prime();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt(), b = scanner.nextInt();
            if (a == 1 && b == 1) {
                System.out.println(0);
                continue;
            }
            int count = 0;
            b++;
            for (int i = a; i < b; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    private static boolean isPrime(int a) {
        if (a == 0) return false;
        if (a == 1) return false;
        boolean ans = true;
        int t;
        int sqrt = (int) Math.sqrt(a);
        for (int i = 2; i < sqrt + 1; i++) {
            t = a % i;
            if (prime.isPrime(i) && t == 0) {
                ans = false;
                break;
            }
        }
        return ans;
    }

    static class Prime {
        private static final int MAX = 100000;
        private Map<Integer, Boolean> primes = new HashMap<>();

        public Prime() {
            for (int i = 2; i < MAX; i++) {
                primes.put(i, true);
            }
            primes.put(0, false);
            primes.put(1, false);
            for (int i = 2; i < MAX; i++) {
                if (primes.get(i)) {
                    for (int j = 2; i * j < MAX; j++) {
                        primes.put(i * j, false);
                    }
                }
            }
        }

        public boolean isPrime(int i) {
            return primes.get(i);
        }
    }
}
