package com.tonypepe.zerojudge.d.d200;

import java.util.Scanner;

public class D294 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(answer(scanner.nextInt(), scanner.nextInt()));
        }
    }

    private static int answer(int a, int b) {
        return a * (a + 1) * b * (b + 1) / 4;
    }
}
