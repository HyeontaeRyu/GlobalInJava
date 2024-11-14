package com.day00;

public class VarEx01 {
    public VarEx01() {
        /*
        단 하나의 값을 저장 할 수 있는 메모리 공간
        */

        /*
        int age; // 변수 선언
        age = 20; // 변수 초기화
        age = 30; // 변수 값 변경
        */

        int age = 20; // 변수 선언 및 초기화
        String name = "홍길동"; // 변수 선언 및 초기화
        String adress = "서울특별시 영등포구 영종로 6가 신안빌딩 글로벌인";
        System.out.print(age + " "); // 변수 값 출력
        System.out.println(age); // 변수 값 출력
        System.out.println("당신의 이름은 " + name + "이고, \n당신의 주소는 " + adress + " 이며,"); // 변수 값 출력
        System.out.printf("당신의 나이는 %d 입니다.", age); // 변수 값 출력
        int a = 10, b = 20;
        System.out.println("바꾸기 전 a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("바꾼 후 a = " + a + ", b = " + b);
    }
}
