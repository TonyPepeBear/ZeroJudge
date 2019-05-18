package com.tonypepe.zerojudge.a.a000;

import java.util.Scanner;

public class A034 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            System.out.println(Integer.toBinaryString(number));
        }
    }
}
