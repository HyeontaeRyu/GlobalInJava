package com.Day01;

/*
 * 입력
 *  - BufferedReader 클래스
 *  - Scanner 클래스
 *
 * 사용자로부터 반지름을 입력 받아 원의 넓이와 둘레를 출력하는 프로그램을 작성.
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class TestEx08 {
    public static void main(String[] args) throws IOException {

        // int r = Integer.parseInt(br.readLine());
        // TestEx06 t6 = new TestEx06(getInputWithBufferedReader());
        TestEx06 t6 = new TestEx06(getInputWithScanner());

        t6.print();

    }

    // BufferedReader 클래스를 이용한 입력
    static int getInputWithBufferedReader() throws IOException {
        int value = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 안내메시지
        System.out.println("반지름 입력 : ");
        String temp = br.readLine();
        if (temp.isEmpty()) {
            System.out.println("값을 입력하세요.");
            return getInputWithBufferedReader();
        } else if (temp.matches("^[0-9]+$")) {
            value = Integer.parseInt(temp);
        } else {
            System.out.println("숫자만 입력하세요.");
            return getInputWithBufferedReader();
        }
        return value;
    }

    // Scanner 클래스를 이용한 입력
    static int getInputWithScanner() {
        int value = 0;
        Scanner sc = new Scanner(System.in);
        // 안내메시지
        System.out.println("반지름 입력 : ");
        String temp = sc.nextLine();
        if (temp.isEmpty()) {
            System.out.println("값을 입력하세요.");
            return getInputWithScanner();
        } else if (temp.matches("^[0-9]+$")) {
            value = Integer.parseInt(temp);
        } else {
            System.out.println("숫자만 입력하세요.");
            return getInputWithScanner();
        }
        return value;
    }
}
