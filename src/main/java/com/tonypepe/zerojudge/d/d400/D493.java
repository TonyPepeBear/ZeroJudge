package com.tonypepe.zerojudge.d.d400;

import java.util.Scanner;

public class D493 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long ans = (long) Math.pow(scanner.nextLong(), scanner.nextInt());
            System.out.printf("%d\n", ans);
        }
    }
}
