package com.tonypepe.zerojudge.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B966 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            List<Range> ranges = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                ranges.add(new Range(scanner.nextInt(), scanner.nextInt()));
            }
            Collections.sort(ranges);
            int answer = 0;
            for (int i = 0; i < ranges.size(); i++) {
                Range range = ranges.get(i);
                int bottom = range.bottom, top = range.top;
                while (i + 1 < ranges.size() && top > ranges.get(i + 1).bottom) {
                    if (top < ranges.get(i + 1).top) {
                        top = ranges.get(i + 1).top;
                    }
                    i++;
                }
                answer += top - bottom;
            }
            System.out.println(answer);
        }
    }

    static class Range implements Comparable<Range> {
        int bottom = -1;
        int top = -1;

        public Range(int bottom, int top) {
            this.bottom = bottom;
            this.top = top;
        }

        @Override
        public String toString() {
            return "(" + String.valueOf(bottom) + " , " + String.valueOf(top) + ")";
        }

        @Override
        public int compareTo(Range range) {
            return bottom - range.bottom;
        }
    }
}
