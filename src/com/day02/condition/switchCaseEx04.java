package com.day02.condition;

import java.util.Arrays;
import java.util.Scanner;

// 가위바위보
public class switchCaseEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = "";
        String[] options = {"가위", "바위", "보"};
        boolean valid = false;

        do {
            System.out.println("가위 바위 보 중 하나 입력.");
            user = sc.nextLine();

            for (String option : options) {
                if (option.equals(user)) {
                    valid = true;
                    break;
                }
            }
            if (!valid) {
                System.out.println("잘못 입력하셨습니다.");
            }
        } while (!valid);

        int com = (int) (Math.random() * 3);
        int userNum = Arrays.asList(options).indexOf(user);

        int result = userNum - com;
        switch (result) {
            case 0:
                System.out.println("비겼습니다.");
                break;
            case -1:
            case 2:
                System.out.println("졌습니다.");
                break;
            case 1:
            case -2:
                System.out.println("이겼습니다.");
                break;
        }
        System.out.println("사용자: " + user + " 컴퓨터: " + (com == 0 ? "가위" : com == 1 ? "바위" : "보"));


    }
}
