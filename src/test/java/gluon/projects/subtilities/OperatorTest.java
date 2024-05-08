package gluon.projects.subtilities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatorTest {

    @Test
    void ternarOperator() {
        Operator operator = new Operator();
        assertFalse(operator.ternaryOperator(true));
        assertFalse(operator.ternaryOperator(false));
    }

    @Test
    void addition() {
        Operator operator = new Operator();
        assertEquals(23, operator.addition(20,3));
    }
}