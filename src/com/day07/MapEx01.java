package com.day07;

import java.util.HashMap;

public class MapEx01 {

    public static void main(String[] args) {

        String[] msg = {"Java", "Python", "C++", "JavaScript", "C#"};

        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < msg.length; i++) {
            map.put(i, msg[i]);
        }
    }
}
