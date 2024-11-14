package com.day06;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx03 {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("JAVA");
        v.add("JSP");
        v.add("Database");
        v.add("Spring");

        Enumeration<String> e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement() + " ");
        System.out.println();

        for (String s : v) System.out.println(s + " ");

        Iterator<String> i = v.iterator();
        while (i.hasNext())
            System.out.println(i.next() + " ");
    }
}
