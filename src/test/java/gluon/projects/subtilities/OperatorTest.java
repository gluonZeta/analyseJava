package gluon.projects.subtilities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatorTest {

    private Operator operator;

    @BeforeEach
    void setUp() {
        this.operator = new Operator();
    }
    
    @Test
    void addition() {
        assertEquals(21, this.operator.addition(15, 6));
    }

    @Test
    void incrementation() {
        assertEquals(6, this.operator.incrementation());
    }
}