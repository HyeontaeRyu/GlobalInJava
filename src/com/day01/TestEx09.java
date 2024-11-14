package com.day01;
/*
 *  본인의 이름, 거주 도시, 나이, 몸무게, 교제 여부 입력받아 출력하는 프로그램 작성
 *  단 입력은 스캐너 클래스를 활용
 * */

import java.util.Scanner;

public class TestEx09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, city;
        int age;
        double weight;
        boolean isMarried;

/*
        System.out.println("이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.println("거주 도시를 입력하세요 : ");
        city = sc.nextLine();
        System.out.println("나이를 입력하세요 : ");
        age = sc.nextInt();
        System.out.println("몸무게를 입력하세요 : ");
        weight = sc.nextDouble();
        System.out.println("결혼 여부를 입력하세요 : ");
        isMarried = sc.nextBoolean();
*/
        System.out.println("이름, 거주 도시, 나이, 몸무게, 결혼 여부(기혼:true, 미혼:false)를 빈 칸으로 구분하여 입력하시오 : ");
        name = sc.next();
        city = sc.next();
        age = sc.nextInt();
        weight = sc.nextDouble();
        isMarried = sc.nextBoolean();


        String isMarriedStr;
        if (isMarried) {
            isMarriedStr = "기혼";
        } else {
            isMarriedStr = "미혼";
        }

        System.out.println("이름 : " + name);
        System.out.println("거주 도시 : " + city);
        System.out.println("나이 : " + age);
        System.out.println("몸무게 : " + weight);
        System.out.println("결혼 여부 : " + isMarriedStr);
    }
}
