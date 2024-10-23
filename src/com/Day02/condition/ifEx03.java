package com.Day02.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ifEx03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n;
        System.out.println("정수 입력: ");
        n = Integer.parseInt(br.readLine());
        if (n % 2 == 0)
            System.out.println("짝수");
        else
            System.out.println("홀수");

    }
}
