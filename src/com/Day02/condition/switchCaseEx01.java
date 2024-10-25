package com.Day02.condition;

import java.util.Scanner;

/*
 * 임의의 알파벳 입력받음.
 * 모음인지 확하는 프로그램 작성.
 * 대소문자 모두 가능해야함.
 * 알파벳 이외에는 아니라고 출력.
 * */
public class switchCaseEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("알파벳 하나를 입력하세요 : ");
        char alp = sc.next().charAt(0);


        if ((alp >= 'a' && alp <= 'z') || (alp >= 'A' && alp <= 'Z')) {
            boolean chk = chkVowel(alp);

            if (chk) {
                System.out.println("모음입니다.");
            } else {
                System.out.println("모음이 아닙니다.");
            }
        } else {
            System.out.println("알파벳이 아닙니다.");

        }


    }

    public static boolean chkVowel(char alp) {
        alp = Character.toLowerCase(alp);
        switch (alp) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;

        }

    }

    public static boolean isEnglishAlphabet(char ch) {
        return Character.toString(ch).matches("[a-zA-Z]");
    }
}
