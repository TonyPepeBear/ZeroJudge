package com.tonypepe.zerojudge.d.d400;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TODO TLE

public class D478 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                List<Integer> a = new ArrayList<>();
                List<Integer> b = new ArrayList<>();
                int counter = 0;
                for (int j = 0; j < m; j++) {
                    a.add(scanner.nextInt());
                }
                for (int j = 0; j < m; j++) {
                    b.add(scanner.nextInt());
                }
                for (Integer a1 : a) {
                    for (Integer b1 : b) {
                        if (a1.equals(b1)) counter++;
                    }
                }
                System.out.println(counter);
            }
        }
    }
}
