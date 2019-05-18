package com.tonypepe.zerojudge.b;

import java.util.LinkedList;
import java.util.Scanner;

public class B923 {

    private final static int REMOVE_FIRST = 1;
    private final static int SHOW_FIRST = 2;
    private final static int INPUT = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                switch (a) {
                    case REMOVE_FIRST:
                        list.remove();
                        break;
                    case SHOW_FIRST:
                        System.out.println(list.peek());
                        break;
                    case INPUT:
                        list.push(scanner.nextInt());
                        break;
                }
            }
        }
    }
}