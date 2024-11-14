package com.day03;

import java.util.Scanner;

/*
 * 콜라 사이다 마운틴듀 초코송이 에이스 웨하스
 * */
public class whileEx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        while (true) {
            input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case 0:
                    System.out.println("프로그램 종료");
                    return;
                case 1:
                    System.out.println("콜라");
                    break;
                case 2:
                    System.out.println("사이다");
                    break;
                case 3:
                    System.out.println("마운틴듀");
                    break;
                case 4:
                    System.out.println("초코송이");
                    break;
                case 5:
                    System.out.println("에이스");
                    break;
                case 6:
                    System.out.println("웨하스");
                    break;
                default:
                    System.out.println("없는 상품입니다.");
                    break;
            }
        }
    }
}
