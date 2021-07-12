package ru.skillbench.tasks.basics.control;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlFlowStatements2ImplTest {

    @Test
    void getFunctionValue() {
        ControlFlowStatements2 object = new ControlFlowStatements2Impl();
        int x = -1;
        assertEquals(-3 * x, object.getFunctionValue(x));
    }

    @Test
    void decodeMark() {
        ControlFlowStatements2 object = new ControlFlowStatements2Impl();
        assertEquals("Fail", object.decodeMark(1));
        assertEquals("Error", object.decodeMark(0));
    }

    @Test
    void initArray() {
        ControlFlowStatements2 object = new ControlFlowStatements2Impl();
        assertEquals(-1, object.initArray()[1][4]);
    }

    @Test
    void getMaxValue() {
        ControlFlowStatements2 object = new ControlFlowStatements2Impl();
        double array[][] = {
                {-10, 2, 4, 0, -1, 8, 7, 5},
                {-10, 2, 4, 0, -1, 8, 7, 5},
                {-10, 2, 4, 0, -1, 8, 7, 5},
                {-10, 2, 4, 0, -1, 8, 7, 5},
                {-10, 2, 4, 0, -1, 8, 7, 5}
        };
        assertEquals(8, object.getMaxValue(array));
    }

    @Test
    void calculateSportsman() {
        ControlFlowStatements2 object = new ControlFlowStatements2Impl();
        assertEquals(5, object.calculateSportsman(100).getTrainingDays());
        assertEquals(310, object.calculateSportsman(100).getTotalDistance());
    }
}