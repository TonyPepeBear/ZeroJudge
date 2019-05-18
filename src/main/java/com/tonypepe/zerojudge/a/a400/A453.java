package com.tonypepe.zerojudge.a.a400;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A453 {
    private static Map<Integer, Boolean> numbers = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        createNumber();
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
                int ans = b * b - 4 * (a * c);
                if (ans < 0) {
                    System.out.println("No");
                    continue;
                }
                if (numbers.get(ans)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }

    private static void createNumber() {
        for (int i = 0; i < 1000000; i++) {
            numbers.put(i, false);
        }
        for (int i = 0; i * i < 1000000; i++) {
            numbers.put(i * i, true);
        }
    }
}
