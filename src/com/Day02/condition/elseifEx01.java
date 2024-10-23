package com.Day02.condition;

import java.util.Scanner;

import static com.Day01.TestEx10.calAvg;

/*
 * 사용자로부터 국어, 영어, 수학 점수를 입력받아 학점을 입력받는 프로그램 작성.
 *
 * A 90 ~ 100
 * B 80 ~ 89
 * C 70 ~ 79
 * D 60 ~ 69
 * F < 60
 * */
public class elseifEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int math, kor, eng;

        System.out.println("수학점수 : ");
        math = sc.nextInt();
        System.out.println("국어점수 : ");
        kor = sc.nextInt();
        System.out.println("영어점수 : ");
        eng = sc.nextInt();

        int avg = (int) calAvg(math, kor, eng);

        System.out.println("(X는 범위 오류) " + "수학 : " + getGrade(math) + " 국어 :  " + getGrade(kor) + " 영어 : " + getGrade(eng) + " 평균 : " + getGrade(avg));
    }

    public static char getGrade(int score) {
        if (score > 89 && score <= 100) {
            return 'A';
        } else if (score > 79 && score <= 90) {
            return 'B';
        } else if (score > 69 && score <= 80) {
            return 'C';
        } else if (score >= 60 && score <= 70) {
            return 'D';
        } else if (!(score >= 0 && score <= 100)) {
            return 'X'; // 범위 외
        } else {
            return 'F';
        }
    }

}
