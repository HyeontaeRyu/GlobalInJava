package com.Day01;

/*
 * 주어진 반지름을 통해 원의 넓이와 둘레를 구하는 프로그램을 작성하시오.
 * 반지름 : 10
 * */
public class TestEx06 {
    final double PI = Math.PI;
    double area;
    double circumference;

    public TestEx06(int radius) {
        area = PI * radius * radius;
        circumference = 2 * PI * radius;
    }

    public double getArea() {
        return area;
    }

    public double getCircumference() {
        return circumference;
    }

    public void print() {
        System.out.printf("원의 둘레 : %.2f\n원의 넓이 : %.2f", circumference, area);
    }
}
