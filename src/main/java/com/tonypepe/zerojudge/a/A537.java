package com.tonypepe.zerojudge.a;

import java.util.*;

public class A537 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Prime prime = new Prime();
        while (scanner.hasNext()) {
            int time = scanner.nextInt();
            for (int caseTime = 0; caseTime < time; caseTime++) {
                String s = scanner.next();
                Map<Character, Integer> map = new HashMap<>();
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (map.containsKey(c)) {
                        map.put(c, map.get(c) + 1);
                    } else {
                        map.put(c, 1);
                    }
                }
                ArrayList<Character> keys = new ArrayList<>(map.keySet());
                Collections.sort(keys);
                System.out.print("Case " + (caseTime + 1) + ": ");
                boolean t = true;
                for (Character key : keys) {
                    int integer = map.get(key);
                    if (prime.isPrimes(integer)) {
                        System.out.print(key);
                        t = false;
                    }
                }
                if (t) {
                    System.out.print("empty");
                }
                System.out.println();
            }
        }
    }

    static class Prime {
        private static final int MAX = 42000;
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

        public boolean isPrimes(int i) {
            return primes.get(i);
        }
    }
}
