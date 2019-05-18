package com.tonypepe.zerojudge.a.a000;

import java.math.BigInteger;
import java.util.Scanner;

public class A021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            BigInteger a = new BigInteger(scanner.next());
            String fun = scanner.next();
            BigInteger b = new BigInteger(scanner.next());
            switch (fun.charAt(0)) {
                case '+':
                    System.out.println(a.add(b));
                    break;
                case '-':
                    System.out.println(a.subtract(b));
                    break;
                case '*':
                    System.out.println(a.multiply(b));
                    break;
                case '/':
                    System.out.println(a.divide(b));
                    break;
            }
        }
    }
}