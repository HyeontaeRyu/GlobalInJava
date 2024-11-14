package com.day07;

import java.util.HashSet;

public class HashSetEx02 {
    public static void main(String[] args) {

        HashSet<Person> hs = new HashSet<>();
        hs.add(new Person("홍길동", 20));
        hs.add(new Person("홍길동", 20));
        hs.add(new Person("김길동", 25));

        System.out.println(hs);

    }
}
