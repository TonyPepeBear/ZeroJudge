package com.tonypepe.zerojudge.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B138 {

    private static final int APPLE_COUNT = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            List<Integer> applesHigh = new ArrayList<>();
            for (int i = 0; i < APPLE_COUNT; i++) {
                applesHigh.add(scanner.nextInt());
            }
            int hand = scanner.nextInt() + 30;
            int ans = 0;
            for (Integer appleHigh : applesHigh) {
                if (appleHigh <= hand) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
