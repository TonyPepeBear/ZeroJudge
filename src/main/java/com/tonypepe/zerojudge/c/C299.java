package com.tonypepe.zerojudge.c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C299 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] s = scanner.nextLine().split(" ");
            List<Integer> number = new ArrayList<>();
            for (String value : s) {
                number.add(Integer.valueOf(value));
            }
            number.remove(0);
            Collections.sort(number);
            boolean t = true;
            for (int i = 0; i < number.size() - 1; i++) {
                if (number.get(i) != number.get(i + 1) - 1) {
                    t = false;
                }
            }
            System.out.print(number.get(0) + " " + number.get(number.size() - 1));
            if (t) {
                System.out.println(" yes");
            } else {
                System.out.println(" no");
            }
        }
    }
}