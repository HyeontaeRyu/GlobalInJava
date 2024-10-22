package com.Day01;

public class TestEx02 {
    public TestEx02() {
        int a = 10; // 변수 선언 및 초기화
        int b; // 변수 선언
        b = 20; // 변수 초기화
        int c = a + b; // a + b의 결과를 c에 저장
        System.out.println("(println) " + a + " + " + b + " = " + c); // 변수 값 출력
        System.out.printf("(printf) %d + %d = %d", a, b, c); // 변수 값 출력
    }
}
