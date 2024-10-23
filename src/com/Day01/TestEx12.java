package com.Day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestEx12 {
    public static void main(String[] args) throws IOException {
        String name;
        String age;
        String adr;
        String tel;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("이름 입력 : ");
        name = br.readLine();
        System.out.println("나이 입력 : ");
        age = br.readLine();
        System.out.println("주소 입력 : ");
        adr = br.readLine();
        System.out.println("연락처 입력 : ");
        tel = br.readLine();

        System.out.printf("이름: %s\n나이 : %s\n주소 : %s\n연락처 : %s", name, age, adr, tel);


    }
}
