package com.day04;

import java.util.Scanner;

public class arr2Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] score = new double[4][2];
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[j].length; j++) {
                System.out.println(i + "학년 " + j + "학기 학점 입력 :");
                score[i][j] = sc.nextDouble();
            }
        }
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[j].length; j++) {
                sum += score[i][j];
                System.out.printf("%.1f ", score[i][j]);
            }
            System.out.println();
        }

        double avg = sum / (score.length * score[0].length);
        System.out.printf("전체 평균 학점 : %.1f", avg);

    }
}
