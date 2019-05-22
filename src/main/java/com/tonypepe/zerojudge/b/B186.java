package com.tonypepe.zerojudge.b;

import java.util.Scanner;

public class B186 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int cookie = scanner.nextInt();
            int chocolate = scanner.nextInt();
            int cake = scanner.nextInt();
            chocolate += Math.min(cookie / 10, cake / 2);
            System.out.println(
                    cookie + " 個餅乾，" + chocolate + " 盒巧克力，" + cake + " 個蛋糕。"
            );
        }
    }
}
