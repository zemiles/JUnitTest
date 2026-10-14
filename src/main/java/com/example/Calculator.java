package com.example;

public class Calculator {

    public int add(int first, int second) {
        return first + second;
    }

    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        return dividend / divisor;
    }
}
