package ru.skillbench.tasks.basics.control;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlFlowStatements1ImplTest {

    @Test
    void getFunctionValue() {
        ControlFlowStatements1 controlFlowStatements1 = new ControlFlowStatements1Impl();
        float x = -1;
        assertEquals(6-x, controlFlowStatements1.getFunctionValue(x));
    }

    @Test
    void decodeWeekday() {
        ControlFlowStatements1 controlFlowStatements1 = new ControlFlowStatements1Impl();
        assertEquals("Monday", controlFlowStatements1.decodeWeekday(1));
        assertEquals("Tuesday", controlFlowStatements1.decodeWeekday(2));
        assertEquals("Wednesday", controlFlowStatements1.decodeWeekday(3));
        assertEquals("Thursday", controlFlowStatements1.decodeWeekday(4));
        assertEquals("Friday", controlFlowStatements1.decodeWeekday(5));
        assertEquals("Saturday", controlFlowStatements1.decodeWeekday(6));
        assertEquals("Sunday", controlFlowStatements1.decodeWeekday(7));
        assertNull(controlFlowStatements1.decodeWeekday(0));
    }

    @Test
    void initArray() {
        ControlFlowStatements1 controlFlowStatements1 = new ControlFlowStatements1Impl();
        assertEquals(2, controlFlowStatements1.initArray()[2][1]);
    }

    @Test
    void getMinValue() {
        ControlFlowStatements1 controlFlowStatements1 = new ControlFlowStatements1Impl();
        int array[][] = {
                {-10, 2, 4, 0, -1},
                {-1, -2, -3, 0, 1},
                {-1, -2, -3, 0, 1},
                {-1, -2, -3, 0, 1},
                {-1, -2, -3, 0, 1},
                {-1, -2, -3, 0, 1},
                {-1, -2, -3, 0, 1},
                {-1, -2, -3, 0, 1}
        };
        assertEquals(-10, controlFlowStatements1.getMinValue(array));
    }

    @Test
    void calculateBankDeposit() {
        ControlFlowStatements1 controlFlowStatements1 = new ControlFlowStatements1Impl();
        assertEquals(4, controlFlowStatements1.calculateBankDeposit(50).years);
        assertEquals(5062.5, controlFlowStatements1.calculateBankDeposit(50).amount);
    }
}