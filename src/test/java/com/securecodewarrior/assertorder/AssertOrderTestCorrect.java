package com.securecodewarrior.assertorder;

import org.junit.*;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertOrderTestCorrect {

    // now that the code is fixed, the assertion is broken so we have a ComparisonFailure
    @Test(expected = ComparisonFailure.class)
    public void testAssertOrder() {
        Integer[] integerArray = new Integer[]{1, 2};
        assertOrder(integerArray, 1, 2, 3);
    }

    void assertOrder(Object[] actual, Object... expected) {
        for (int i = 0; i < actual.length; i++) {
            assertThat(actual[i]).isEqualTo(expected[i]);
        }
        assertThat(actual.length).isEqualTo(expected.length);

    }
}
