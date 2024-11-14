package com.day01;


public class TestEx05 {
    int a; // 전역 변수는 자동으로 초기화 됨.


    public TestEx05() {
        // int a; 지역 변수로 초기화 하지 않고 사용하면 오류 발생
        int b;
        // double b; 같은 영역에 같은 이름의 변수를 선언할 수 없음.
        System.out.println(a);

        int c = 10, d; // 가능
        System.out.println(c);
        // System.out.println(d); // 변수 선언만 하고 초기화 하지 않으면 오류 발생

        byte p = 127;
        short q = 32767;
        int r = 2147483647;

        /*
         * long 자료형의 범위에 해당하는 숫자 뒤에는 접미사 l 또는 L을 붙여야 함.
         * 약 21억 이상 되는 상수에 사용
         * */
        long s = 9223372036854775807L; //
        // p = q; 작은 자료형에 큰 자료형을 대입할 수 없음.
        // p = (byte) q; 강제 형변환을 통해 대입 가능.

        float f = 15.123458f;
        /*
         * float 또한 접미사 f 또는 F를 붙여야 함.
         * */
        double g = 2 / 3.0;


        System.out.println(p);
        System.out.println(q);
    }
}
