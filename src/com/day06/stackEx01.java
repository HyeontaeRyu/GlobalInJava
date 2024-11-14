package com.day06;

import java.util.Stack;

public class stackEx01 {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        String str1 = "aaa";
        String str2 = "bbb";
        String str3 = "ccc";
        String str4 = "ddd";

        s.push(str1);
        s.push(str2);
        s.push(str3);
        s.push(str4);

        System.out.println(s.peek());
        System.out.println(s.search(str2));
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
    }
}
