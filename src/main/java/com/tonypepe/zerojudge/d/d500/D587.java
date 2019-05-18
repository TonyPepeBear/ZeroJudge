package com.tonypepe.zerojudge.d.d500;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D587 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            List<Integer> integers = new ArrayList<>();
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                integers.add(scanner.nextInt());
            }
            integers.sort(Integer::compareTo);
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
