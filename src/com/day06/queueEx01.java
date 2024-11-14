package com.day06;

import java.util.Arrays;
import java.util.LinkedList;

public class queueEx01 {
    private static final String[] Colors = {"검정", "노랑", "초록", "연두", "빨강", "파랑"};
    static LinkedList<String> l = new LinkedList<>();

    queueEx01() {
        /*for (String c : Colors) {
            l.offer(c);
        }*/
        l.addAll(Arrays.asList(Colors));

    }

    public static void main(String[] args) {
        new queueEx01();
        /*System.out.println(l.peek());
        System.out.println(l.poll());
        System.out.println(l.peek());
        System.out.println(l.element());
        System.out.println(l.remove());
*/
        String val;
  /*      while (!(l.peek() == null)) {
            val = l.poll();
            System.out.println(val);
        }*//*
        while (true) {
            val = l.poll();
            if (val == null)
                break;
            System.out.println(val);
        }*/
        while (!(l.isEmpty()))
            System.out.println(l.poll());
    }
}
