package com.day02.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 사용자로부터 임의의 두 정수와 연산자를 입력받아 해당 연산을 처리하는 프로그램을 작성
 *
 * if문 활용, 연산자는 char 자료형 사용
 *
 * 출력 결과
 * 첫번째 정수:
 * 연산자 입력(+, -, *, /, %):
 * 두번째 정수:
 *
 * */
public class ifEx04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = 0, n2 = 0;
        char opr = 'z';

        try {
            System.out.println("첫번째 정수 입력:");
            n1 = Integer.parseInt(br.readLine());

        } catch (NumberFormatException e) {
            System.out.println("올바른 숫자를 입력하세요");
        }

        do {
            try {
                System.out.println("연산자 입력:");
                // opr = (br.readLine()).charAt(0);
                opr = br.readLine().charAt(0);
                if (opr != '+' && opr != '-' && opr != '*' && opr != '/' && opr != '%') {
                    System.out.println("올바른 연산자를 입력해주세요.");
                }

            } catch (NumberFormatException e) {
                System.out.println("올바른 연산자를 입력해주세요.");
            }
        } while (opr != '+' && opr != '-' && opr != '*' && opr != '/' && opr != '%');


        System.out.println("두번째 정수 입력:");
        n2 = Integer.parseInt(br.readLine());

        int result = twoNumCal(n1, n2, opr);
        if (result == Integer.MIN_VALUE)
            System.out.println();
        System.out.println("결과 : " + twoNumCal(n1, n2, opr));
    }

    public static int twoNumCal(int n1, int n2, char opr) {
        if (opr == '+') {
            return n1 + n2;
        } else if (opr == '-') {
            return n1 - n2;
        } else if (opr == '*') {
            return n1 * n2;
        } else if (opr == '/') {
            return n1 / n2;
        } else if (opr == '%') {
            return n1 % n2;
        } else {
            return Integer.MIN_VALUE;
        }
    }
}
