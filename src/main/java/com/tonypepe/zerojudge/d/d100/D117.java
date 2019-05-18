package com.tonypepe.zerojudge.d.d100;

import java.util.Scanner;

public class D117 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String app = "ZAa";
            int num = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) <= app.charAt(0)) {
                    num += s.charAt(i) - app.charAt(1) + 27;
                } else {
                    num += s.charAt(i) - app.charAt(2) + 1;
                }
            }
            boolean t = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    t = false;
                    break;
                }
            }
            if (t) {
                System.out.println("It is a prime word.");
            } else {
                System.out.println("It is not a prime word.");
            }
        }
    }
}
