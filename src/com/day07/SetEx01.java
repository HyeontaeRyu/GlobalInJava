package com.day07;

import java.util.HashSet;
import java.util.Iterator;

class AData {
    int x;
    int y;

    public AData(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("x = " + x + ", y = " + y);
    }
}

public class SetEx01 {
    public static void main(String[] args) {

        AData a1 = new AData(10, 20);
        AData a2 = new AData(30, 40);
        AData a3 = new AData(50, 60);

        HashSet<AData> hs = new HashSet<>();
        hs.add(a1);
        hs.add(a2);
        hs.add(a3);

        Iterator<AData> it = hs.iterator();

        while (it.hasNext()) {
            it.next().display();

        }
    }
}
