package com.tonypepe.zerojudge.a.a600;

import java.util.Scanner;

public class A621 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n + 1; i++) {
                System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
            }
        }
    }
}
