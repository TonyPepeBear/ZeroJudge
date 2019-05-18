package com.tonypepe.zerojudge.d.d500;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class D562 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            List<Integer> integers = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                integers.add(scanner.nextInt());
            }
            while (!integers.isEmpty()) {
                for (Integer integer : integers) {
                    System.out.print(integer + " ");
                }
                integers.remove(0);
                Collections.reverse(integers);
                System.out.println();
            }
        }
    }
}