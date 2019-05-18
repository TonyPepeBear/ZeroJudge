package com.tonypepe.zerojudge.d.d500;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class D511 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(Ans.answer(scanner));
        }
    }

    private static class Ans {
        static int answer(Scanner scanner) {
            int ans = 0;
            for (int i = 0; i < 5; i++) {
                if (counter(scanner)) {
                    ans++;
                }
            }
            return ans;
        }

        private static boolean counter(Scanner scanner) {
            int a = scanner.nextInt(),
                    b = scanner.nextInt(),
                    c = scanner.nextInt();
            List<Integer> integers = new ArrayList<>();
            integers.add(a);
            integers.add(b);
            integers.add(c);
            Collections.sort(integers);
            return integers.get(0) + integers.get(1) > integers.get(2);
        }
    }
}