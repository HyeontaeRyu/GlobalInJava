package com.day03.Task;

import java.util.Scanner;

public class for05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0, oddSum = 0, sum = 0;
        int input = sc.nextInt();
        for (int i = 1; i < input + 1; i++) {
            sum += i;
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
            if (i % 10 == 0) {
                System.out.printf("1~%d까지의 합 : %d\n1~%d까지의 짝수 합 : %d\n1~%d까지의 홀수 합 : %d\n\n", i, sum, i, evenSum, i, oddSum);
            }
        }
        System.out.printf("전체 합 : %d\n짝수 합 : %d\n홀수 합 : %d", sum, evenSum, oddSum);
    }
}
