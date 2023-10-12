package org.example;

import org.junit.jupiter.api.Test;

public class TP1LastZeroTest {

    @Test
    public void lastZeroTest() {
        int[] tableau = {0};
        assert (TP1.lastZero(tableau) == tableau.length - 1);
    }

    @Test
    public void lastZeroTestOk() {
        int[] tableau = {1, 1, 1, 0};
        assert (TP1.lastZero(tableau) == tableau.length - 1);
    }

    @Test
    public void lastZeroTestFail() {
        int[] tableau = {1};
        assert (TP1.lastZero(tableau) == -1);
    }

    @Test
    public void lastZeroTestEmpty() {
        int[] tableau = {};
        assert (TP1.lastZero(tableau) == -1);
    }
}
