package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;

public class TP1OddOrPos {
    @Test
    public void oddOrPosTest() {
        int[] tableau = {1};
        assertAll(TP1.oddOrPos(tableau) == 1);
    }
}
