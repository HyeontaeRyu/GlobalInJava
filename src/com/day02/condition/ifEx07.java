package com.day02.condition;

import java.util.Scanner;

public class ifEx07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int input = 0;
        int left = 0;

        int fiftyK = 0;
        int tenK = 0;
        int fiveK = 0;
        int k = 0;
        int fiveH = 0;
        int h = 0;
        int fifty = 0;
        int ten = 0;

        do {

            System.out.println("금액을 투입해 주세요.");
            input = sc.nextInt();

        } while (input % 10 != 0);

        if (input >= 50000) {
            fiftyK = input / 50000;
            left = input % 50000;
        }
        if (left >= 10000) {
            tenK = left / 10000;
            left = left % 10000;
        }
        if (left >= 5000) {
            fiveK = left / 5000;
            left = left % 5000;
        }
        if (left >= 1000) {
            k = left / 1000;
            left = left % 1000;
        }
        if (left >= 500) {
            fiveH = left / 500;
            left = left % 500;
        }
        if (left >= 100) {
            h = left / 100;
            left = left % 100;
        }
        if (left >= 50) {
            fifty = left / 50;
            left = left % 50;
        }
        if (left >= 10) {
            ten = left / 10;
            left = left % 10;
        }

        System.out.printf("50000원 : %d장\n", fiftyK);
        System.out.printf("10000원 : %d장\n", tenK);
        System.out.printf("5000원 : %d장\n", fiveK);
        System.out.printf("1000원 : %d장\n", k);
        System.out.printf("500원 : %d장\n", fiveH);
        System.out.printf("100원 : %d장\n", h);
        System.out.printf("50원 : %d장\n", fifty);
        System.out.printf("10원 : %d장\n", ten);
    }
}
