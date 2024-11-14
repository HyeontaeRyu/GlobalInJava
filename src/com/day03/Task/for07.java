package com.day03.Task;

import java.util.Scanner;

/*
 * 사용자로부터 숫자를 입력받아 그 수만큼의 3의 배수를 출력하는 프로그램 구현
 * */
public class for07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, input = sc.nextInt();
        for (int i = 0; i < input + 1; i++) {
            sum += 3;
            System.out.println(sum + " ");
        }

    }
}
