package com.day03.Task;

import java.util.Scanner;

public class for10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        if (input < 65 || input > 90) {
            System.out.println("잘못된 입력입니다.");
            return;
        }
        for (char i = 'A'; i <= input; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
