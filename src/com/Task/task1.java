package com.Task;

public class task1 {
    public static void main(String[] args) {
        int a = 1;

        for (int i = 1; i <= 5; i++) {
            System.out.println();
            if (i % 2 == 0) {
                a += 4;
            }
            // a += (i % 2 == 0) ? 4 : 0;
            for (int j = 1; j <= 5; j++) {
                printa(a);
                if (i % 2 == 0) {
                    a -= 1;
                } else {
                    a += 1;
                }
                // a += (i % 2 == 0) ? -1 : 1;
            }
            if (i % 2 == 0) {
                a += 6;
            }
            // a += (i % 2 == 0) ? 6 : 0;


        }
    }

    public static void printa(int a) {
        System.out.print(a + ((a < 10) ? "  " : " "));
    }


}
