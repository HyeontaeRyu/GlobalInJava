package com.Day02.condition;

import java.util.InputMismatchException;
import java.util.Scanner;

// 월을 입력받으면 입력받은 계절을 출력하는 프로그램
public class switchCaseEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = -1;
        do {
            try {

                System.out.println("1~12까지의 수를 입력하세요.");
                input = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("올바른 정수를 입력해 주세요.");
                sc.next();
                continue;
            }


            switch (input) {
                case 12:
                case 1:
                case 2:
                    System.out.println("겨울 입니다.");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("봄 입니다.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("여름 입니다.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("가을 입니다.");
                    break;
                default:
                    System.out.println("범위를 벗어났습니다.");
                    break;
            }
        } while (!(input >= 1 && input <= 12));

    }
}
