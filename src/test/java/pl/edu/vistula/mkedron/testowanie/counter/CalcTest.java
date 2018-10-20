package pl.edu.vistula.mkedron.testowanie.counter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.edu.vistula.mkedron.testowanie.calc.Calc;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    private Calc calc;

    @BeforeEach
    void init() {
        calc = new Calc();
    }

    @Test
    void multiplicity(){
        Integer result = calc.multiplicity(3,4);
        assertEquals(result.intValue(), 3*4);
    }

    @Test
    void summary() {
        Integer result = calc.sum(5,9);
        assertEquals(result.intValue(),14);
    }

    @Test
    void outOfTheBoundSummary() {
        Integer result = calc.sum(100000,20000);
        if(result != null) {
            fail("Max sum has been exceeded, but no fail has been noticed.");
        }
    }

    @Test
    void outOfTheBoundMultiplicity() {
        Integer result = calc.multiplicity(100000,100);
        if(result != null) {
            fail("Max multiplicity result has been exceeded, but no fail has been noticed.");
        }
    }
}