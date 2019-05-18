package com.tonypepe.zerojudge.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                numbers.add(scanner.nextInt());
            }
            Collections.sort(numbers);
            for (Integer number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
