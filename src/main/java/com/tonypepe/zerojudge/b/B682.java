package com.tonypepe.zerojudge.b;

import java.util.Scanner;

public class B682 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            Time time1 = new Time(scanner.nextInt(), scanner.nextInt());
            Time time2 = new Time(scanner.nextInt(), scanner.nextInt());
            System.out.println(Time.answer(time1, time2));
        }
    }

    private static class Time {
        private int hour;
        private int minute;

        Time(int hour, int minute) {
            this.hour = hour;
            this.minute = minute;
        }

        static Time answer(Time time1, Time time2) {
            int hour = time2.getHour() - time1.getHour();
            int minute = time2.getMinute() - time1.getMinute();
            if (minute < 0) {
                hour--;
                minute += 60;
            }
            if (hour < 0) {
                hour += 24;
            }
            return new Time(hour, minute);
        }

        int getHour() {
            return hour;
        }

        int getMinute() {
            return minute;
        }

        @Override
        public String toString() {
            return String.valueOf(hour) + " " + String.valueOf(minute);
        }
    }
}