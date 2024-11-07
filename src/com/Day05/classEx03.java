package com.Day05;

import java.util.Scanner;

class myClass {
    static int a = 10;
    static int b = 20;
    int c = 30;
    int d = 40;


    public myClass() {
    }

    public myClass(int a) {
    }

    int add() {
        return a + b;
    }
}

class Grade {
    private int kor;
    private int eng;
    private int math;

    public Grade(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int total() {
        return kor + eng + math;
    }

    float avg() {
        return total() / 3.0f;
    }
}

class Tv {
    private int year;
    private int inch;
    private String company;

    public Tv() {

    }

    public Tv(int year, int inch, String company) {
        this.year = year;
        this.inch = inch;
        this.company = company;
    }

    void show() {
        System.out.println(year + "년 " + inch + "인치 " + company + " TV");
    }
}

public class classEx03 {
    public static void main(String[] args) {
        Tv myTv = new Tv(2024, 32, "LG");
        myTv.show();

        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수 입력:");
        int kor = sc.nextInt();
        System.out.print("영어 점수 입력:");
        int eng = sc.nextInt();
        System.out.print("수학 점수 입력:");
        int math = sc.nextInt();

        Grade g = new Grade(kor, eng, math);
        System.out.printf("총점: %d\n", g.total());
        System.out.printf("평균: %.2f\n", g.avg());


    }
}
