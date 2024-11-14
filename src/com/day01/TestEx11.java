package com.day01;

import java.io.IOException;

public class TestEx11 {
    public static void main(String[] args) throws IOException {
        int num1, num2;
        System.out.println("숫자 입력 : ");
        num1 = System.in.read() - '0'; // '0' = ASCII 에서 48
        System.out.println(num1);
    }
}
