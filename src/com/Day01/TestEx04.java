package com.Day01;


public class TestEx04 {
    public TestEx04() {
        // double pi = Math.PI;
        // float  pi = 3.141592f; float로 선언 시 수의 끝에 f 붙여야 함.
        int r = 5;
        // double area = pi * r * r;
        // float  area = (float) (Math.PI * r * r);
        double area = Math.PI * r * r;
        System.out.printf("반지름이 %d인 원의 넓이는 %f입니다.", r, area);


    }
}
