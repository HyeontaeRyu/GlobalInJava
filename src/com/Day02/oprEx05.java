package com.Day02;

/*
 * 사용자로부터 임의의 정수를 입력 받아 입력 받은 정수가 홀수인지 짝수인지 판정하는 프로그램을 작성하시오.
 *
 * 입력 : 17
 *
 * 조건
 * 삼항연산자 활용
 * */

import java.util.InputMismatchException;
import java.util.Scanner;

public class oprEx05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하시오.");
        String result = "";
        do {
            try {
                result = isEven(sc.nextInt()) ? "짝수 입니다." : "홀수 입니다.";
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력해 주세요.");
                sc.next();
            }
        } while (result.isEmpty());


        System.out.println(result);
    }

    public static boolean isEven(int num) {
        return (num % 2) == 0;
    }
}
