package com.day02.condition;

import java.util.Scanner;

public class scannerEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("주민번호 [123456-1234567]를 입력하세요.");
        String jumin = sc.nextLine();

        switch (jumin.charAt(7)) {
            case '1':
            case '3':
                System.out.println("남자입니다.");
                break;
            case '2':
            case '4':
                System.out.println("여자입니다.");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                break;
        }

    }
}
