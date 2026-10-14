package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("두 수를 더할 수 있다")
    void add() {
        // given
        int first = 2;
        int second = 3;

        // when
        int result = calculator.add(first, second);

        // then
        assertEquals(5, result);
    }

    @Test
    @DisplayName("0으로 나누면 예외가 발생한다")
    void divideByZero() {
        // when & then
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(10, 0)
        );

        assertEquals("0으로 나눌 수 없습니다.", exception.getMessage());
    }
}
