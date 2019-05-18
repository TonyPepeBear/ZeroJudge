package com.tonypepe.zerojudge.c;

import java.util.Scanner;

public class C636 {
    public static char[] animals = {'鼠', '牛', '虎', '兔', '龍', '蛇', '馬', '羊', '猴', '雞', '狗', '豬'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(answer(scanner.nextInt()));
        }
    }

    private static char answer(int a) {
        if (a < 0) a++;
        return animals[(--a + 1200) % 12];
    }
}
