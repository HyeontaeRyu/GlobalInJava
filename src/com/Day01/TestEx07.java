package com.Day01;

/*
 * 가로 세로가 주어지면 넓이와 둘레를 출력하는 프로그램을 작성.
 * */
public class TestEx07 {
    int width, height;
    int area, perimeter;

    public TestEx07(int width, int height) {
        this.width = width;
        this.height = height;
        area = width * height;
        perimeter = 2 * (width + height);
    }

    public void print() {
        System.out.printf("사각형의 넓이 : %d\n사각형의 둘레 : %d", area, perimeter);
    }
}
