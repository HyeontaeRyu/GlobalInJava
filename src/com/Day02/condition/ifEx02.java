package com.Day02.condition;

import java.util.Scanner;

public class ifEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

/*        if (b >= a && b >= c) {
            int temp = a;
            a = b;
            b = temp;
        } else if (c >= a && c >= b) {
            int temp = c;
            c = b;
            b = temp;
        }
        if (c >= b) {
            int temp = c;
            b = c;
            c = temp;
        }*/
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a < c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b < c) {
            int temp = b;
            b = c;
            c = temp;
        }
        System.out.printf("%d%d%d", a, b, c);

    }

}
