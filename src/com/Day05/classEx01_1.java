package com.Day05;

public class classEx01_1 {
    // 최댓값
    public int max(int num1, int num2) {

        if (num1 >= num2) {
            return num1;
        } else {
            return num2;
        }

    }

    // 두 수 사이의 합계
    public int btSum(int num1, int num2) {
        int sum = 0;
        for (int i = num1 + 1; i < num2; i++)
            sum += i;
        return sum;
    }

    // 큰 순서대로 출력
    public void print(int num1, int num2) {
        int[] arr = new int[2];

        if (num1 >= num2) {
            arr[0] = num1;
            arr[1] = num2;
        } else {
            arr[0] = num2;
            arr[1] = num1;
        }

        for (int j : arr) System.out.println(j);
    }
}
