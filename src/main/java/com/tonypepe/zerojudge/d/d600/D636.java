package com.tonypepe.zerojudge.d.d600;

import java.math.BigInteger;
import java.util.Scanner;

//65% TLE

public class D636 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(new BigInteger(String.valueOf(scanner.nextInt())).pow(scanner.nextInt()).mod(new BigInteger("10007")));
        }
    }
}
