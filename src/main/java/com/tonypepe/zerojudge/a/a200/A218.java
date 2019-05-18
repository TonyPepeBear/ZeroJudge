package com.tonypepe.zerojudge.a.a200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A218 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            List<Number> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(new Number(i));
            }
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                numbers.get(x).countPlusOne();
            }
            Collections.sort(numbers);
            for (Number number : numbers) {
                if (number.count != 0) {
                    System.out.print(number + " ");
                }
            }
            System.out.println();
        }
    }

    private static class Number implements Comparable<Number> {
        private int num;
        private int count;

        Number(int num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return String.valueOf(num);
        }

        void countPlusOne() {
            count++;
        }

        @Override
        public int compareTo(Number o) {
            if (this.count > o.count) {
                return -1;
            } else if (this.count < o.count) {
                return 1;
            } else {
                return this.num - o.num;
            }
        }
    }
}

