package com.ohgiraffers.tdd_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculatorTests {

//    @Test
//    public void sumTwoNumbers1() {
//        Calculator cal = new Calculator();
//        Assertions.assertEquals(3, cal.sumTwoNumbers(1, 2));
//    }
//
//    @Test
//    public void sumTwoNumbers2() {
//        Calculator cal = new Calculator();
//        Assertions.assertEquals(5, cal.sumTwoNumbers(3, 2));
//    }
//
//    @Test
//    public void sumTwoNumbers3() {
//        Calculator cal = new Calculator();
//        Assertions.assertEquals(6, cal.sumTwoNumbers(4, 2));
//    }

    @DisplayName("합계 기능 테스트")
    @ParameterizedTest
    @MethodSource("provideNumberSources")
    public void sumTowNumbers(int num1, int num2, int expected) {
        Calculator cal = new Calculator();
        int actual = cal.sumTwoNumbers(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> provideNumberSources() {
        return Stream.of(
                arguments(1, 2, 3),
                Arguments.of(3, 2, 5),
                Arguments.of(2, 4, 6)
        );
    }
}
