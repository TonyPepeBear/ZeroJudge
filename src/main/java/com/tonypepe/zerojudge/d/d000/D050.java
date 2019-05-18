package com.tonypepe.zerojudge.d.d000;

import java.util.Scanner;

public class D050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println((scanner.nextInt() + 9) % 24);
        }
    }
}
