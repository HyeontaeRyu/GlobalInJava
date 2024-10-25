package com.Day02.condition;

/*
 * 두 자리의 정수를 입력 받고 1의 자리와 10의 자리가 같은지 판단하는 프로그램을 작성
 * */

import java.util.Scanner;

public class ifEx06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;


        do {
            input = sc.nextInt();
            if (input >= 1 && input <= 99) {
                break;
            }
            System.out.println("1~99가 아닙니다.");
        } while (!(input >= 1 && input <= 99));

        int ten = input;
        while (ten >= 10) {
            ten = (int) (ten / 10);
        }

        // 일의 자리
        int first = input % 10;

        System.out.println("일의 자리 : " + first + " 십의 자리 : " + ten);
        if (ten == first) {
            System.out.println("일의 자리와 십의 자리가 같습니다.");
        } else {
            System.out.println("일의 자리와 십의 자리가 다릅니다.");
        }

    }

}
