package com.day02.condition;

import java.util.Scanner;

public class ifEx09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start, end;
        start = sc.nextInt();
        end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (tsn(i)) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 20 == 0) {
                System.out.println();
            }
        }

    }

    public static boolean tsn(int num) {
        int[] numArray = toIntArr(num);

        // 369에 해당하는 부분인지 확인
        boolean hasThree = false;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == 3 || numArray[i] == 6 || numArray[i] == 9 || num % 3 == 0) {
                hasThree = true;
                break;
            }
        }


        return hasThree;
        /*
        if (hasThree) {
            System.out.print("* ");
        } else {
            System.out.print(arrayToInt(numArray) + " ");
        }
         */
    }

    public static int[] toIntArr(int num) {
        String intStr = Integer.toString(num);
        int[] numArray = new int[intStr.length()];

        for (int i = 0; i < intStr.length(); i++) {
            numArray[i] = Character.getNumericValue(intStr.charAt(i));
        }
        return numArray;
    }

    public static int arrayToInt(int[] numArray) {
        int result = 0;
        for (int digit : numArray) {
            result = result * 10 + digit;
        }
        return result;
    }
}
