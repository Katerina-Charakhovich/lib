package com.charakhovich.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    public void isPositiveNumberPositiveTest() {
        boolean isPositive = StringUtils.isPositiveNumber("13");
        assertTrue(isPositive);
    }

    @Test
    public void isPositiveNumberNegativeTest() {
        boolean isPositive = StringUtils.isPositiveNumber("-13");
        assertFalse(isPositive);
    }


}