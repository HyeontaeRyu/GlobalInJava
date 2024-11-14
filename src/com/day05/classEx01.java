package com.day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class classEx01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = 0;
        int a, b;

        while (true) {
            System.out.println("1: 최대값 2: 두 수 사이의 합계 3: 큰 순서대로 출력 4: 종료");
            x = Integer.parseInt(br.readLine());
            classEx01_1 cl = new classEx01_1();
            switch (x) {
                case 1:
                    System.out.println("첫 번째 수 입력: ");
                    a = Integer.parseInt(br.readLine());
                    System.out.println("두 번째 수 입력: ");
                    b = Integer.parseInt(br.readLine());

                    System.out.println(cl.max(a, b));
                    break;
                case 2:
                    System.out.println("첫 번째 수 입력: ");
                    a = Integer.parseInt(br.readLine());
                    System.out.println("두 번째 수 입력: ");
                    b = Integer.parseInt(br.readLine());

                    System.out.println(cl.btSum(a, b));
                    break;
                case 3:
                    System.out.println("첫 번째 수 입력: ");
                    a = Integer.parseInt(br.readLine());
                    System.out.println("두 번째 수 입력: ");
                    b = Integer.parseInt(br.readLine());

                    cl.print(a, b);
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }
            System.out.println();

        }
    }
}
