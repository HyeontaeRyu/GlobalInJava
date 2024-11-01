package com.Day04;
/*
    문]
    2차원 배열을 이용하여 여러명에 대해서 성적처리하는 프로그램을 구현하시오.
    단,학생수와 과목은 입력받는다.

    점수, 총점, 평균, 학점, 석차
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arr2Ex02 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = {"국어", "영어", "수학"};
        System.out.print("학생수 입력:");
        int human = Integer.parseInt(br.readLine());
        String[] name = new String[human];

        System.out.print("과목수 입력:");
        int su = Integer.parseInt(br.readLine());
        String[] subject = new String[su];

        //점수와 총점 처리 배열
        int[][] jumsu = new int[human][su + 1];
        float[] avg = new float[human];
        char[] grade = new char[human];
        int[] rank = new int[human];

        //과목명을 가져옴
        for (int i = 0; i < su; i++) {
            subject[i] = str[i];
        }
        // 사람수 만큼 반복
        for (int i = 0; i < human; i++) {
            System.out.print(i + 1 + " 번째 학생 이름:");
            name[i] = br.readLine();
            System.out.println(name[i] + "학생 점수 입력:");
            for (int j = 0; j < su; j++) {
                System.out.println(subject[j] + " 점수");
                jumsu[i][j] = Integer.parseInt(br.readLine());
                jumsu[i][su] += jumsu[i][j];
            }
        }
        //평균
        for (int i = 0; i < human; i++) {
            avg[i] = (float) jumsu[i][su] / su;
            //소수점 세째자리 반올림해서 소수점 둘째자리까지 표시
            avg[i] = (int) ((avg[i] + 0.005) * 100) / 100.f;
        }

        //학점
        for (int i = 0; i < human; i++) {
            switch ((int) (avg[i] / 10)) {
                case 10:
                case 9:
                    grade[i] = 'A';
                    break;
                case 8:
                    grade[i] = 'B';
                    break;
                case 7:
                    grade[i] = 'C';
                    break;
                case 6:
                    grade[i] = 'D';
                    break;
                default:
                    grade[i] = 'F';
                    break;
            }
        }

        //석차 계산
        for (int i = 0; i < human; i++) {
            rank[i]++;
            for (int j = 0; j < human; j++) {
                if (avg[i] < avg[j]) {
                    rank[i]++;
                }
            }
        }
        System.out.println();

        //결과
        System.out.println("=== 성적표 ===");
        System.out.println("이 름\t");
        for (int j = 0; j < subject.length; j++) {
            System.out.print(subject[j] + "\t");
        }
        System.out.println("총점\t평균\t학점\t석차");
        //입력 데이터 출력
        for (int i = 0; i < human; i++) {
            System.out.println(name[i] + "\t");
            for (int j = 0; j < su; j++) {
                System.out.print(jumsu[i][j] + "\t");
            }
            System.out.println(jumsu[i][su] + "\t" + avg[i] + "\t" + grade[i] + "\t" + rank[i]);

        }
    }
}