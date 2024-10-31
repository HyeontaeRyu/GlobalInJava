package com.Day04;

import java.io.IOException;
import java.util.Scanner;

public class arrEx02 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("이름 입력: ");
        String name = sc.nextLine();
//        String[] subject = {"국어", "영어", "수학", "사회", "과학"};
        String[] subject = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            subject[i] = args[i];
        }
        int[] score = new int[subject.length];
        for (int i = 0; i < subject.length; i++) {
            System.out.println(subject[i] + " 점수 입력: ");
            score[i] = sc.nextInt();
        }
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        avg = sum / score.length;
        System.out.println("이름: " + name);
        for (int i = 0; i < subject.length; i++) {
            System.out.println(subject[i] + " : " + score[i]);
        }
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);

    }
}
