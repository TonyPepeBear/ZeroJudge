package com.tonypepe.zerojudge.a;

import java.util.Scanner;

public class A244 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            for (int i = 0; i < N; i++) {
                int type = scanner.nextInt();
                switch (type) {
                    case 1:
                        System.out.println(scanner.nextLong() + scanner.nextLong());
                        break;
                    case 2:
                        System.out.println(scanner.nextLong() - scanner.nextLong());
                        break;
                    case 3:
                        System.out.println(scanner.nextLong() * scanner.nextLong());
                        break;
                    case 4:
                        System.out.println(scanner.nextLong() / scanner.nextLong());
                        break;
                }
            }
        }
    }
}
