package com.task;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("한 행에 표시할 단 입력.");
        int input = sc.nextInt();
        sc.close();


        for (int i = 2; i < 10; i += input) {

            for (int j = 1; j <= 9; j++) {
                for (int k = i; k < i + input && k < 10; k++) {
                    System.out.printf("%d * %d = %2d\t\t", k, j, k * j);

                }
                System.out.println();
            }
            System.out.println();


        }
    }
}
