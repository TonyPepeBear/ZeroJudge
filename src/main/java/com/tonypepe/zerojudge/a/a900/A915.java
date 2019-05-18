package com.tonypepe.zerojudge.a.a900;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A915 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            List<Point> points = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                points.add(new Point(scanner.nextInt(), scanner.nextInt()));
            }
            Collections.sort(points);
            for (Point point : points) {
                System.out.println(point);
            }
        }
    }

    static class Point implements Comparable<Point> {

        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return x + " " + y;
        }

        @Override
        public int compareTo(Point other) {
            if (this.x > other.x) {
                return 1;
            } else if (this.x < other.x) {
                return -1;
            } else {
                return Integer.compare(this.y, other.y);
            }
        }
    }
}
