package com.Day04;

public class arrEx01 {
    public static void main(String[] args) {
        int[] lot = new int[6];
        for (int i = 0; i < lot.length; i++) {
            lot[i] = (int) (Math.random() * 45) + 1;
            for (int j = 0; j < i; j++) {
                if (lot[i] == lot[j]) {
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < lot.length - 1; i++) {
            boolean change = false;
            for (int j = 0; j < lot.length - 1 - i; j++) {
                if (lot[j] > lot[j + 1]) {
                    int temp = lot[j];
                    lot[j] = lot[j + 1];
                    lot[j + 1] = temp;
                    change = true;
                }
            }
            if (!change) {
                break;
            }
        }
        for (int i = 0; i < lot.length; i++) {
            System.out.print(lot[i] + " ");
        }
    }
}
