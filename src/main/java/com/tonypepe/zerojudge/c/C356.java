package com.tonypepe.zerojudge.c;

import java.util.Scanner;

//Memory Limit Exceed

public class C356 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            String s = scanner.next();
            scanner.next();
            for (int i = 0; i < N * N; i++) {
                if (i % (N + 1) == 0) {
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
