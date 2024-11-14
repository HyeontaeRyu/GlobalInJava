package com.day03;

/*
 * 1~10까지 덧셈으로 표기하고 합계를 출력하는 프로그램 작성
 *
 * */

public class forEx01 {
    public static void main(String[] args) {
        int sum = 0;
        String s = "";
        for (int i = 1; i <= 10; i += 1) {
            sum += i;
            if (i != 10) {
                s += i + " + ";

            } else {
                s += i + " = " + sum;
            }
        }
        System.out.println(s);
    }

}
