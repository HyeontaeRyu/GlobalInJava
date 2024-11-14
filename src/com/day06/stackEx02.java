package com.day06;

import java.util.Stack;

public class stackEx02 {

    //문자 배열 선언 및 초기화

    private static final String[] Colors = {"검정", "노랑", "초록", "연두", "빨강", "파랑"};

    static Stack<String> s = new Stack<>();

    public stackEx02() {
        for (String c : Colors) {
            s.push(c);
        }
    }

    public static void main(String[] args) {
        new stackEx02();
        popStack(s);
    }

    private static void popStack(Stack<String> s) {
        System.out.println("pop : ");
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
