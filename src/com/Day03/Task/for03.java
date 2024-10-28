package com.Day03.Task;

import java.util.Scanner;

public class for03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        if (input1 > input2) {
            input1 = input1 ^ input2;
            input2 = input1 ^ input2;
            input1 = input1 ^ input2;

        }
        int sum = 0;
        String s = "";
        for (int i = input1 + 1; i < input2; i += 1) {
            s += i + " ";
            sum += i;

        }
        System.out.println(input1 + " 과 " + input2 + " 사이에 있는 정수들은 " + s + "입니다.");
        System.out.println("그 합계는 " + sum + " 입니다.");
    }
}
