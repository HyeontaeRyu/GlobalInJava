package com.day07;

import java.util.*;

public class HashSetEx01 {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; i < 7; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);
        }


        System.out.println(set);
        List list = new ArrayList(set);
        Collections.sort(list);
        System.out.println(list);

    }
}
