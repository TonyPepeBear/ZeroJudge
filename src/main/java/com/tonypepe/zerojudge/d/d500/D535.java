package com.tonypepe.zerojudge.d.d500;

import java.math.BigInteger;
import java.util.Scanner;

public class D535 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            next:
            {
                String s = scanner.nextLine();
                //isNumber
                try {
                    new BigInteger(s);
                } catch (Exception e) {
                    System.out.println("INCORRECT");
                    break next;
                }
                //isPalindrome
                for (int i = 0; i < s.length() / 2 + 1; i++) {
                    if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                        System.out.println("INCORRECT");
                        break next;
                    }
                }
                //next * 2 > this
                //pick %2 == 0
                StringBuilder ans = new StringBuilder();
                for (int i = 0; i < s.length() - 1; i++) {
                    int a = Character.getNumericValue(s.charAt(i));
                    int b = Character.getNumericValue(s.charAt(i + 1));
                    if (b * 2 < a) {
                        System.out.println("INCORRECT");
                        break next;
                    }
                    if (a % 2 == 0) {
                        ans.append(a);
                    }
                }
                if (Character.getNumericValue(s.charAt(s.length() - 1)) % 2 == 0) {
                    ans.append(Character.getNumericValue(s.charAt(s.length() - 1)));
                }
                //show
                if (ans.toString().equals("")) {
                    System.out.println("0");
                }
                System.out.println(ans);
            }
        }
    }
}
