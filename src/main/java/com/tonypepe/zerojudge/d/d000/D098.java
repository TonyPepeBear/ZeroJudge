package com.tonypepe.zerojudge.d.d000;

import java.util.Scanner;

public class D098 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            String[] inputs = input.split(" ");
            int ans = 0;
            for (String s : inputs) {
                try {
                    ans += Integer.valueOf(s);
                } catch (Exception ignored) {

                }
            }
            System.out.println(ans);
        }
    }
}
