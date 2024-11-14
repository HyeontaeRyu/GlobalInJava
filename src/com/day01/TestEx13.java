package com.day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.day01.TestEx10.calAvg;

public class TestEx13 {
    public static void main(String[] args) throws IOException {
        int math, kor, eng, sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("국어 점수 : ");
        kor = Integer.parseInt(br.readLine());
        System.out.println("수학 점수 : ");
        math = Integer.parseInt(br.readLine());
        System.out.println("영어 점수 : ");
        eng = Integer.parseInt(br.readLine());

        sum = kor + math + eng;

        System.out.println("점수 합계 : " + sum + " 점수 평균 : " + calAvg(sum, '3'));
    }
}
