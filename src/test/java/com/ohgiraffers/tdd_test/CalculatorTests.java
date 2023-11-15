package com.ohgiraffers.tdd_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    @Test
    public void sumTwoNumbers() {
        Calculator cal = new Calculator();
        Assertions.assertEquals(3, cal.sumTwoNumbers(1, 2));
    }

}
