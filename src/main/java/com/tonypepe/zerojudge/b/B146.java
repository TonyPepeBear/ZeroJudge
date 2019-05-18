package com.tonypepe.zerojudge.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B146 {

    private static final int WEEK_DAYS = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            List<Day> days = new ArrayList<>();
            for (int i = 0; i < WEEK_DAYS; i++) {
                days.add(new Day(i, scanner.nextInt(), scanner.nextInt()));
            }
            Collections.sort(days);
            System.out.println(days.get(6));
        }
    }

    static class Day implements Comparable<Day> {
        int date;
        int inSchool;
        int afterSchool;
        int time;
        boolean unhappy;

        Day(int date, int inSchool, int afterSchool) {
            this.date = date + 1;
            this.inSchool = inSchool;
            this.afterSchool = afterSchool;
            time = afterSchool + inSchool;
            unhappy = time > 8;
        }

        @Override
        public int compareTo(Day o) {
            if (this.time > o.time) {
                return 1;
            } else if (this.time < o.time) {
                return -1;
            } else {
                if (this.date < o.date) {
                    return 1;
                } else if (this.date > o.date) {
                    return -1;
                }
            }
            return 0;
        }

        @Override
        public String toString() {
            return String.valueOf(date);
        }
    }
}
