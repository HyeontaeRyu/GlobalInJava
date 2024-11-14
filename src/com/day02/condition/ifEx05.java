package com.day02.condition;

import java.io.IOException;

import static com.day02.condition.switchCaseEx01.isEnglishAlphabet;

/*
 * 알파벳 한 문자를 입력받아 이를 판별하여
 * 소문자를 입력 받았을 경우 대문자로 변환
 * 대문자 > 소문자.
 *
 * 조건 System.in.read 활용
 * */
public class ifEx05 {
    public static void main(String[] args) throws IOException {
        char a;
        do {
            System.out.println("알파벳 입력.");
            a = (char) System.in.read();
            //noinspection StatementWithEmptyBody
            while (System.in.read() != '\n') ;
//            System.in.skip(1); //위가 나음. 둘다 입력 스트림 비움.
            if (isEnglishAlphabet(a)) {
                if (Character.isLowerCase(a)) {
                    a = Character.toUpperCase(a);
                    System.out.println(a);
                } else {
                    a = Character.toLowerCase(a);
                    System.out.println(a);
                }
            } else {
                System.out.println("알파벳을 입력하세요.");
//                System.in.read();

            }

        } while (!isEnglishAlphabet(a));
    }
}
