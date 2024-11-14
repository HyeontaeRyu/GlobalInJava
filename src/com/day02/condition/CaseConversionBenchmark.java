package com.day02.condition;

public class CaseConversionBenchmark {
    public static void main(String[] args) {
        char[] testChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int iterations = 1000000;

        // Benchmark using built-in functions
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            for (char c : testChars) {
                char upper = Character.toUpperCase(c);
                char lower = Character.toLowerCase(c);
            }
        }
        long endTime = System.nanoTime();
        long builtInDuration = endTime - startTime;

        // Benchmark using arithmetic operations
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            for (char c : testChars) {
                char upper = (c >= 'a' && c <= 'z') ? (char) (c - 32) : c;
                char lower = (c >= 'A' && c <= 'Z') ? (char) (c + 32) : c;
            }
        }
        endTime = System.nanoTime();
        long arithmeticDuration = endTime - startTime;

        System.out.println("Built-in functions duration: " + builtInDuration + " ns");
        System.out.println("Arithmetic operations duration: " + arithmeticDuration + " ns");
    }
}
//367450900
//67805600