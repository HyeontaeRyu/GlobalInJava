package com.Day02.condition;

import java.util.Scanner;

public class switchCaseEx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"에스프레소", "카푸치노", "카페라떼", "아메리카노"};
        boolean found;

        do {
            System.out.println("커피를 입력하세요:");
            String coffee = sc.nextLine();
            found = false;

            for (String item : menu) {
                if (item.equals(coffee)) {
                    found = true;
                    switch (coffee) {
                        case "에스프레소":
                        case "카푸치노":
                        case "카페라떼":
                            System.out.println("3500원 입니다.");
                            break;
                        case "아메리카노":
                            System.out.println("2000원 입니다.");
                            break;
                    }
                    break;
                }
            }

            if (!found) {
                System.out.println("올바른 커피 명을 입력해주세요.");
            }
        } while (!found);
    }
}
