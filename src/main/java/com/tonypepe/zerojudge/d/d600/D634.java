package com.tonypepe.zerojudge.d.d600;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class D634 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            ArrayList<String> magics = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String s = scanner.nextLine();
                if (!s.equals("")) {
                    magics.add(s);
                } else {
                    i--;
                }
            }
            Collections.sort(magics);
            for (String magic : magics) {
                System.out.println(magic);
            }
        }
    }
}
