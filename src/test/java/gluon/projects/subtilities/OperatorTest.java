package gluon.projects.subtilities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatorTest {

    @Test
    void ternarOperator() {
        boolean testB = true;
        Operator operator = new Operator();
        assertFalse(operator.ternarOperator(testB));
    }
}