package com.day04;

import java.util.Scanner;

public class arrEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        String inputStr = "";
        String[] st = {"가위", "바위", "보"};
        System.out.println("가위, 바위, 보 중 하나 입력.");


        do {

            do {
                inputStr = sc.nextLine();
                if (inputStr.equals("그만"))
                    return;
                if (!inputStr.equals("가위") && !inputStr.equals("바위") && !inputStr.equals("보"))
                    System.out.println("가위, 바위 혹은 보 중 하나를 입력해주세요.");
            } while (!inputStr.equals("가위") && !inputStr.equals("바위") && !inputStr.equals("보"));

            if (inputStr.equals(st[1]))
                input = 1;
            else if (inputStr.equals(st[2]))
                input = 2;


            int com = (int) (Math.random() * 3);

            int result = input - com;
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
            System.out.println("사용자: " + inputStr + " 컴퓨터: " + (com == 0 ? "가위" : com == 1 ? "바위" : "보"));
        } while (true);

    }

}
