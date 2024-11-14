package com.Day06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

class vector1 extends Vector<Object> {
    public vector1() {
        super(1, 1);

    }

    public void addInt(int i) {
        addElement(i);
    }

    public void addFloat(float f) {
        addElement(f);
    }

    public void addCharArray(char[] c) {
        addElement(c);
    }

    public void write() {

        Object o;
        int length = size();
        System.out.println("벡터 개수" + length);

        for (int i = 0; i < length; i++) {
            o = elementAt(i);
            if (o instanceof char[]) {
                System.out.println("문자 배열 : " + String.copyValueOf((char[]) o));
            } else if (o instanceof String) {
                System.out.println("문자열 : " + o.toString());
            } else if (o instanceof Integer) {
                System.out.println("정수형 : " + o);
            } else {
                System.out.println("실수형 : " + o);
            }
        }
    }

    public void addString(String s) {
        addElement(s);
    }
}

public class vectorEx01 {
    //　데이터 추가 add, addElement, insertElement
    //삭제 removeElement, remove, removeAllElement, Clear
    // 순차적
    //
    private static final String[] Colors = {"검정", "노랑", "초록", "연두", "빨강", "파랑"};
    static Vector<String> vv = new Vector<>();

    public vectorEx01() {
        vv.addAll(Arrays.asList(Colors));

        System.out.println(vv.firstElement());
        System.out.println(vv.get(1));
        System.out.println(vv.lastElement());
        System.out.println(vv.size());

        vv.set(0, "하양");

        for (String s : vv) {
            System.out.println(s);
        }

        Collections.sort(vv);
        int b = Collections.binarySearch(vv, "하양", Collections.reverseOrder());
        for (String s : vv) {
            System.out.println(s);
        }

        // 오름차순
        vv.sort(Collections.reverseOrder());

        int a = Collections.binarySearch(vv, "하양");
        System.out.println(a);


    }


    public static void main(String[] args) {

        vector1 v = new vector1();

        int digit = 5;
        float real = 3.14f;
        char[] letters = {'J', 'A', 'V', 'A'};
        String s = "성공합시다!";

        v.addInt(digit);
        v.addFloat(real);
        v.addCharArray(letters);
        v.addString(s);
        v.write();

        for (Object o : v) {
        }
    }
}
