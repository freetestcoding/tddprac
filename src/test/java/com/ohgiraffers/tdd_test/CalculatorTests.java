package com.ohgiraffers.tdd_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    @Test
    public void sumTwoNumbers1() {
        Calculator cal = new Calculator();
        Assertions.assertEquals(3, cal.sumTwoNumbers(1, 2));
    }

    @Test
    public void sumTwoNumbers2() {
        Calculator cal = new Calculator();
        Assertions.assertEquals(5, cal.sumTwoNumbers(3, 2));
    }

    @Test
    public void sumTwoNumbers3() {
        Calculator cal = new Calculator();
        Assertions.assertEquals(6, cal.sumTwoNumbers(4, 2));
    }


}
