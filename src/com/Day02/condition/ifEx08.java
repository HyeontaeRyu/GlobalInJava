package com.Day02.condition;

import java.util.Scanner;

/*
 * 세 개의 정수를 입력 받아 중간 크기의 수를 출력하는 프로그램을 작성
 * */
public class ifEx08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3 = -1;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if ((n1 >= n2 && n1 <= n3) || (n1 <= n2 && n1 >= n3)) {
            System.out.println(n1);
        } else if ((n2 >= n1 && n2 <= n3) || (n2 <= n1 && n2 >= n3)) {
            System.out.println(n2);
        } else if ((n3 >= n1 && n3 <= n2) || (n3 <= n1 && n3 >= n2)/*true*/) {
            System.out.println(n3);
        }

    }
}
