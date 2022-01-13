package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyMathTest {

    @Test
    void shouldSumTwoValue() {
        final MyMath myMath = new MyMath();
        Assertions.assertEquals(2, myMath.sum(1, 1));
    }
}
