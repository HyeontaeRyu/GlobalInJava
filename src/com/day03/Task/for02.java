package com.day03.Task;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 양의 실수만 입력받아 입력받은 합계의 평균을 구하시오.
 * 단, 음의 실수가 입력되면 평균을 계산하여 출력
 *
 * */
public class for02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input;
        ArrayList<Double> inputs = new ArrayList<>();
        do {
            input = sc.nextDouble();
            if (input < 0) {
                inputs.add(input);
            }
        } while (input < 0);

    }
}
