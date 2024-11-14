package com.day07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx02 {

    public static void main(String[] args) {

        Object[] arr = {"1", new Integer(1), "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        Set set = new HashSet();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println(set);
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
