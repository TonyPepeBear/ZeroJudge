package com.tonypepe.zerojudge.d.d700;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class D784 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < n; i++) {
                String s[] = scanner.nextLine().split(" ");
                ArrayList<Integer> list = new ArrayList<>();
                for (String value : s) {
                    list.add(Integer.valueOf(value));
                }
                list.remove(0);
                ArrayList<Integer> sumArray = new ArrayList<>();
                for (int j = 0; j < list.size(); j++) {
                    int sum = 0;
                    for (int k = 0; k < list.size() - j; k++) {
                        sum += list.get(j + k);
                        sumArray.add(sum);
                    }
                }
                System.out.println(Collections.max(sumArray));
            }
        }
    }
}