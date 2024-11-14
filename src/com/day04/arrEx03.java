package com.day04;

import java.util.Scanner;

public class arrEx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        int input = sc.nextInt();
        int[] result = new int[unit.length];
        for (int i = 0; i < unit.length; i++) {
            result[i] = input / unit[i];
            input %= unit[i];
        }
        for (int i = 0; i < unit.length; i++) {
            System.out.println(unit[i] + "원 : " + result[i] + "개");
        }

    }
}
