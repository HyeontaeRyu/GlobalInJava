package com.Day03.Task;

import java.util.Scanner;

/*
 * factorial
 *
 *
 * */
public class for04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long total = 1;
        for (int i = 1; i < n + 1; i += 1) {
            total = total * i;
        }
        System.out.println("값 : " + total);
    }
}
