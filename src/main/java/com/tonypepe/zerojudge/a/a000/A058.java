package com.tonypepe.zerojudge.a.a000;

import java.util.Scanner;

public class A058 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int zero = 0, one = 0, two = 0;
            for (int i = 0; i < n; i++) {
                int anInt = scanner.nextInt();
                int num = anInt % 3;
                switch (num) {
                    case 0:
                        zero++;
                        break;
                    case 1:
                        one++;
                        break;
                    case 2:
                        two++;
                }
            }
            System.out.println(zero + " " + one + " " + two);
        }
    }
}
