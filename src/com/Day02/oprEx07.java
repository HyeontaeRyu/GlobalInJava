package com.Day02;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 사용자로부터 연도를 입력받아 입력받은 연도가 윤년인지 판별하는 프로그램을 작성하라
 *
 *  삼항연산자 활용
 *
 * */
public class oprEx07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String isLeapYearStr = "";
        boolean isLeapYearBool;
        do {
            try {
                System.out.println("연도를 입력하세요 (정수)");
                isLeapYearBool = isLeapYear(sc.nextInt());
                isLeapYearStr = isLeapYearBool ? "윤년입니다." : "평년입니다.";
            } catch (InputMismatchException e) {
                sc.next();
            }


        } while (isLeapYearStr.isEmpty());

        System.out.println(isLeapYearStr);
    }

    public static boolean isLeapYear(int year) {

        // 4로 떨어지면 윤년
        // 100으로 떨어지며 400으로 나누어 떨어지지 않으면 윤년 아님
        return year % 4 == 0 && (year % 100 != 0 || (year % 400 == 0));
        // return year % 4 == 0 ? (year % 100 != 0 ? true : (year % 400 != 0 ? false : true)) : false;
    }
}
