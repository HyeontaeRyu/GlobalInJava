package com.Day01;

public class TestEx03 {

    /*
     * 전역 변수는 자동으로 초기화 됨.
     * */
    int e; // 전역 변수 선언

    public TestEx03() {
        /*
         * 변수 선언 및 초기화
         */

        // 변수 선언 및 데이터 입력 시 자료형이 같은 변수는 콤마(,)로 연결하여 한번에 선언 및 초기화 가능
        int a = 10, b = 5; // 여러 변수 선언 및 초기화
        System.out.println(a + ", " + b);
        // 변수 선언
        int c, d;
        // System.out.println("c = " + c + ", d = " + d); // 변수 선언만 하고 초기화 하지 않으면 오류 발생

        // 전역 변수 사용
        System.out.println("e = " + e);


    }

}
