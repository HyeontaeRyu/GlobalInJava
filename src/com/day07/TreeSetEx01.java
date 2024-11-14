package com.day07;

import java.util.TreeSet;

public class TreeSetEx01 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        for (int i = 0; i < 7; i++) {
            int num = (int) (Math.random() * 45) + 1;
            ts.add(num);
        }
        System.out.println(ts);
    }
}
