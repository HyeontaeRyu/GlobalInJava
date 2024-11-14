package com.day02;

/*
 * 비트 연산자
 *
 * */
public class oprEx03 {
    public static void main(String[] args) {
        int a = 101, b = 121;
        String ba = Integer.toBinaryString(a);
        String bb = Integer.toBinaryString(b);

        System.out.println(ba);
        System.out.println(bb);
        System.out.println();

        System.out.printf("(NOT)  ~a : %d (%s)\n", (~a), Integer.toBinaryString(~a));
        System.out.printf("(AND) a&b :  %d  (0000000000000000000000000%s)\n", a & b, Integer.toBinaryString(a & b));
        System.out.printf("(OR)  a|b :  %d (0000000000000000000000000%s)\n", a | b, Integer.toBinaryString(a | b));
        System.out.printf("(XOR) a^b :  %d  (000000000000000000000000000%s)\n\n", a ^ b, Integer.toBinaryString(a ^ b));

        System.out.printf("a<<2  (=a*4) : %d(%s)\n", a << 2, Integer.toBinaryString(a << 2));
        System.out.printf("a>>2  (=a/4 *나머지 버림) : %d(%s)\n", a >> 2, Integer.toBinaryString(a >> 2));
        System.out.printf("a>>>2 (=a/4 *나머지 버림) : %d(%s)\n", a >>> 2, Integer.toBinaryString(a >>> 2));
    }
}
