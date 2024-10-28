package com.Day03.Task;

import java.util.Scanner;

public class for06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, mul = 0;
        input = sc.nextInt();
        if (!(input > 1 && input < 10)) {
            System.out.printf("잘못된 입력.\n프로그램 종료.");
            return;
        }
        for (int i = 1; i < 10; i++)
            System.out.println(input + " * " + i + " = " + input * i);


    }
}
