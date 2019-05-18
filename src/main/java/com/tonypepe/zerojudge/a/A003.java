package com.tonypepe.zerojudge.a;

import java.util.Scanner;

public class A003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt(), d = scanner.nextInt();
            int s = (m * 2 + d) % 3;
            switch (s) {
                case 0:
                    System.out.println("普通");
                    break;
                case 1:
                    System.out.println("吉");
                    break;
                case 2:
                    System.out.println("大吉");
                    break;
            }
        }
    }
}
