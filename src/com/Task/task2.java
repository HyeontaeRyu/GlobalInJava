package com.Task;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("한 행에 표시할 단 입력.");
        int input = sc.nextInt();
        sc.close();
        /*int i = 1, j = 2;
        while (j < 10) {
            while (i <= input) {
                System.out.printf("%d * %d = %2d\t\t", i, j, i * j);
                i++;
            }
            i = 2;

                *//*input += input;
                if (input > 9) {
                    input = 9;
                }*//*
            System.out.println();
            j++;
        }*/
        int temp = 2;
        for (int i = 2; i < 10; i += input) {
            temp += input;
            for (int j = 1; j <= 9; j++) {
                for (int k = i; k < temp && k < 10; k++) {
                    System.out.printf("%d * %d = %2d\t\t", k, j, k * j);

                }
                System.out.println();
            }
            System.out.println();


        }
    }
}
