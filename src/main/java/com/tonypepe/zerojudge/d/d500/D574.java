package com.tonypepe.zerojudge.d.d500;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D574 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            scanner.nextInt();
            String s = scanner.next();
            List<Character> ss = new ArrayList<>();
            List<Words> words = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                ss.add(s.charAt(i));
            }
            Character t = null;
            int cnt = 1;
            for (Character character : ss) {
                if (t == null) {
                    t = character;
                    cnt = 1;
                } else {
                    if (character.equals(t)) {
                        cnt++;
                    } else {
                        words.add(new Words(cnt, t));
                        t = character;
                        cnt = 1;
                    }
                }
            }
            words.add(new Words(cnt, t));
            StringBuilder ans = new StringBuilder();
            for (Words word1 : words) {
                ans.append(word1.len).append(word1.s);
            }
            String answer = ans.toString();
            System.out.println((answer.length() > s.length()) ? s : answer);
        }
    }

    private static class Words {
        int len;
        char s;

        Words(int len, char s) {
            this.len = len;
            this.s = s;
        }
    }
}