package com.Day03.Task;

/*
 * 3의 승수를 입력하여 값을 구하는 프로그램을 구현
 *
 * */

import java.util.Scanner;

public class for09 {
    public static void main(String[] args) {
        // 입력 받기 위한 scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 입력 받을 변수 선언
        int input;

        // 입력 받아 변수에 대입
        input = sc.nextInt();

        // 결과값을 저장할 변수 선언 및 초기화 (3의 0승은 1이므로 1로 초기화)
        int total = 1;

        // 입력 받은 값만큼 반복
        for (int i = 1; i <= input; i++) {

            // 3의 승수를 구하기 위해 total에 3을 곱함
            total = total * 3;
        }

        // 결과 출력
        System.out.println("3의 " + input + "승은 " + total + "입니다.");
    }
}
