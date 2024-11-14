package com.day06;


import java.util.Vector;

class Mydata {
    int age;
    String name;

    public Mydata(String s, int a) {
        this.name = s;
        this.age = a;
    }
}

public class vectorEx02 {


    public static void main(String[] args) {
        Vector<Mydata> v = new Vector<>();
        v.add(new Mydata("aa", 2));
        for (Mydata a : v)
            System.out.printf("%s, %d\n", a.name, a.age);
    }
}
