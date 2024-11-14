package com.day07;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListEx01 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("Python");

        List<String> list2 = new ArrayList<>(list1);
        list2.add("C++");

        List<String> list3 = new ArrayList<>();
        list3.addAll(list2);

        int n = list3.indexOf("Python");
        System.out.println(n);
        list3.add(n + 1, "JavaScript");
        System.out.println(list3);

        ListIterator<String> it = list3.listIterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        list3.add(n + 1, "C#");
        it = list3.listIterator(list3.size());
        while (it.hasPrevious()) {
            String s = it.previous();
            System.out.println(s);
        }

    }
}
