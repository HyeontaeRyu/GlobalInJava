package com.day02.condition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ifEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        do {
            try {
                System.out.println("양의 정수 입력.");
                x = sc.nextInt();
                if (x > 0) {
                    System.out.println("x : " + x + " 출력 되었습니다.");
                } else {
                    System.out.println("양의 정수를 입력하시오.");
                }
            } catch (InputMismatchException e) {
                System.out.println("양의 정수를 입력하시오.");
                sc.next();
            }
        } while (!(x > 0));
    }
}
