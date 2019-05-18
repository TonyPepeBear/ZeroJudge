package com.tonypepe.zerojudge.b;

import java.util.*;

public class B130 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            Set<Integer> numbers = new HashSet<>();
            for (int i = 0; i < n; i++) {
                numbers.add(scanner.nextInt());
            }
            List<Integer> arrayNumber = new ArrayList<>(numbers);
            Collections.sort(arrayNumber);
            System.out.println(arrayNumber.size());
            for (Integer integer : arrayNumber) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
