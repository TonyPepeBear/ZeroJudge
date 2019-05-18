package com.tonypepe.zerojudge.d.d900;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class D980 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("Case ");
                System.out.print(i + 1);
                System.out.print(": ");
                ArrayList<Long> integers = new ArrayList<>(Arrays.asList(
                        scanner.nextLong(), scanner.nextLong(), scanner.nextLong()));
                Collections.sort(integers);
                if (integers.get(0) + integers.get(1) <= integers.get(2)) {
                    System.out.println("Invalid");
                } else if (integers.get(0).equals(integers.get(1))
                        && integers.get(0).equals(integers.get(2))
                        && integers.get(1).equals(integers.get(2))) {
                    System.out.println("Equilateral");
                } else if (integers.get(0).equals(integers.get(1))
                        || integers.get(0).equals(integers.get(2))
                        || integers.get(1).equals(integers.get(2))) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }
        }
    }
}
