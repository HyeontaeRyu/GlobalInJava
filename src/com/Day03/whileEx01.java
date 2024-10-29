package com.Day03;

/*
 * -1^2 +2^2 -3^2 +4^2-... +100^2
 *
 * */
public class whileEx01 {
    public static void main(String[] args) {

        int cnt = 1;
        int sum = 0;
        int sim = 1;

        while (cnt <= 100) {
            sim = -sim;
            sum += sim * (cnt * cnt);


            cnt++;
        }
        System.out.println(sum);
    }
}
