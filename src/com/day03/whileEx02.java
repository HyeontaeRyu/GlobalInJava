package com.day03;

public class whileEx02 {
    public static void main(String[] args) {
        int a = -50;
        while (a < 0) {

            System.out.print(a + "  ");
            if (a > -10) {
                System.out.print(" ");
            }
            a++;
            if (a % 5 == 0) {
                System.out.println();
            }
        }
    }
}
