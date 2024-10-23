package com.Day02;

import java.util.Scanner;

/*
 * 산술 연산자
 * '+, -, *, /, %'
 *
 * */
public class oprEx02 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("총 3 중 1번째 수 입력 : ");
        a = sc.nextInt();
        System.out.println("총 3 중 2번째 수 입력 : ");
        b = sc.nextInt();
        System.out.println("총 3 중 3번째 수 입력 : ");
        c = sc.nextInt();

        /*
         * System.out.println(" '+' 연산 : " + (a + b + c));
         * System.out.println(" '-' 연산 : " + (a - b - c));
         * System.out.println(" '*' 연산 : " + (a * b * c));
         * System.out.println(" '/' 연산 : " + (a / b / c));
         * System.out.println(" '%' 연산 : " + (a % b % c));
         * */
        System.out.printf(" '+' 연산 : %d%n", (a + b + c));
        System.out.printf(" '-' 연산 : %d%n", (a - b - c));
        System.out.printf(" '*' 연산 : %d%n", (a * b * c));
        System.out.printf(" '/' 연산 : %d%n", (a / b / c));
        System.out.printf(" '%%' 연산 : %d%n", (a % b % c));

    }
}
