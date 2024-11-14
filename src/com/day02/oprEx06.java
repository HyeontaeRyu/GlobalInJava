package com.day02;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 사용자로부터 임의의 정수를 입력받아 입력받은 정수가 양수인지 음수인지 0인지를 판정하는 프로그램을 작성
 *
 *
 * 조건 : 삼항연산자로 처리
 * */
public class oprEx06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        String resultStr = "";

        do {
            try {
                System.out.println("정수를 입력해 주세요.");
                result = isNatural(sc.nextInt());
                // resultStr = result == 0 ? "0 입니다." : (result == 1 ? "양수 입니다." : "음수 입니다.");
                if (result == 0) {
                    resultStr = "0 입니다.";
                } else if (result == -1) {
                    resultStr = "음수 입니다.";
                } else if (result == 1) {
                    resultStr = "양수 입니다.";
                }
            } catch (InputMismatchException e) {
                sc.next();
            }
        } while (resultStr.isEmpty());

        System.out.println(resultStr);
    }

    public static int isNatural(int num) {
        // return 값 -1은 음수 0은 0 1은 양수
        // return num == 0 ? 0 : (num < 0 ? -1 : 1);
        return Integer.compare(num, 0);
    }
}
