package com.tonypepe.zerojudge.d.d300;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class D323 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            List<Integer> integers = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                integers.add(Integer.valueOf(scanner.next()));
            }
            Collections.sort(integers);
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}