package com.Day03.Task;

import java.util.Scanner;

/*
 * 입력된 정수의 평균을 구하는 프로그램을 구하시오.
 * 입력받을 정수의 개수를 입력 받고 정수들을 입력하고 평균값을 출력
 * 입력 정수 출력 실수
 *
 * */
public class for08 {
    public static void main(String[] args) {
        // 입력 받기 위해 스캐너 인스턴스 생성
        Scanner sc = new Scanner(System.in);
        // 입력 받을 정수를 담기 위한 int 형의 num 변수 선언
        // 그리고 바로 정수를 입력 받아 num 변수에 대입
        System.out.print("입력 받을 정수의 갯수 입력 : ");
        int num = sc.nextInt();
        // 평균을 구하기 위한 합계를 위한 int형의 sum 변수 선언 및 0 으로 초기화 (초기화 안하면 for 문 안에서 사용 안됨)
        int sum = 0;
        // i가 1부터 num에 입력 받은 정수가 될 때 까지  {} 안의 식을 반복
        for (int i = 1; i <= num; i++) {
            // 매 반복 마다 정수를 입력 받아( sc.nextInt() ) sum에다가 더한 후 그 더해진 값을 sum에 대입
            // sum += sc.nextInt; 와 같음
            System.out.print("정수 입력 : ");
            sum = sum + sc.nextInt();

        }
        // 합계와 개수를 더한 평균값을 구해서 출력
        // System.out.println("평균값 : " + (sum / num));
        System.out.printf("평균값 : %.2f", (double) (sum / num));


        // 무시해주세요.
        /*int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("평균값 : " + calAvg(nums));*/
    }
}
