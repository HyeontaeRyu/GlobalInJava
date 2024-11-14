package com.day03.Task;

import java.util.Scanner;

/*
 * 사용자로부터 정수를 입력받아 0부터 입력한 정수까지의 합을 구하는 프로그램을 작성
 * */
public class for01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        sc.close();
        for (int i = 0; i < input; i += 1) {
            sum += i + 1;
        }
        System.out.println("0 부터 " + input + " 까지의 값은 " + sum + " 입니다.");
    }
}
