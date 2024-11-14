package com.task.task3;

import java.util.Scanner;

public class ScannerUtil {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static int getNextInt() {
        while (true) {
            try {
                return SCANNER.nextInt();
            } catch (Exception e) {
                System.out.println("올바른 숫자를 입력해주세요.");
                SCANNER.next();
            }
        }
    }

    public static char getNextChar() {
        while (true) {
            String input = SCANNER.next();
            if (input.length() == 1) {
                return input.charAt(0);
            } else {
                System.out.println("올바른 문자를 입력해주세요.");
            }
        }
    }
}