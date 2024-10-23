package com.Day01;

import java.util.Scanner;

/*
 * 국어 영어 수학 사회 과학 5 과목의 점수를 입력 받아 평균을 구하는 프로그램을 작성
 * 단 입력은 Scanner 클래스 활용, 평균은 실수로 처리
 * */
public class TestEx10 {
    public static void main(String[] args) {
        int kor, eng, math, society, science;
        double avg;

        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 국어, 영어, 수학, 사회, 과학 순으로 입력(구분은 공백으로) :");
        kor = sc.nextInt();
        eng = sc.nextInt();
        math = sc.nextInt();
        society = sc.nextInt();
        science = sc.nextInt();

        // avg = (double) (kor + eng + math + society + science) / 5;
//        avg = calAvg(kor, eng, math, society, science);
        avg = calAvg(kor, eng);
        System.out.printf("평균 점수는 %.1f 입니다.", avg);

    }

    public static double calAvg(int... integers) {
        // List<int> integers 랑 같음
        int sum = 0;
        for (int integer : integers) {
            sum += integer;
        }
        double avg = (double) sum / integers.length;
        return Math.floor(avg * 10) / 10.0;
    }

    public static double calAvg(int sum, char count) {
        int intCount = Integer.parseInt(String.valueOf(count));
        double avg = (double) sum / intCount;
        return Math.floor(avg * 10) / 10.0;
    }


}
