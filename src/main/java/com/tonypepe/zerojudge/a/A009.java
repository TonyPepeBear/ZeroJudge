package com.tonypepe.zerojudge.a;

import java.util.Scanner;

public class A009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                ans.append((char) (s.charAt(i) - 7));
            }
            System.out.println(ans);
        }
    }
}
