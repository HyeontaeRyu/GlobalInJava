package com.Day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class oprEx01 {
    public static void main(String[] args) throws IOException {
        int a = 20, b = 30, max;
/*

        // a > b 가 true 일 경우 a를 max에 대입 후 a += 1
        // false 일 경우 b를 max에 대입 후 b += 1
        max = a > b ? a++ : b++;

        System.out.println(max);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
*/
        second();

    }

    public static void second() throws IOException {
        /*
         * 숫자 하나 입력받아 그 수가 1이면 "남성" 2이면 "여성" 이라는 글자를 출력하는 프로그램 작성.
         *
         * 조건 삼항 연산자로 구현
         *
         * 입력
         * 성별 입력 (남성 : 1), (여성 : 2) : 1
         *
         * 출력
         * 당신은 남성입니다.
         * */
        int input;

        do {
            System.out.println("성별 입력 (남성 : 1), (여성 : 2) : ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                input = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                input = 0;
            }
            /*
            input = System.in.read() - '0';
            System.in.read();
            */
            if (input == 1 || input == 2) {
                break;
            }
            System.out.println("1 또는 2를 입력하세요.");
        } while (true);


        String gender = input == 1 ? "당신은 남성입니다." : "당신은 여성입니다.";

        System.out.println(gender);


    }
}
