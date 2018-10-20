package pl.edu.vistula.mkedron.testowanie.counter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    private Counter counter;

    @BeforeEach
    void init() {
        counter = new Counter();
    }

    @Test
    void initializationCounterField() {
        assertNotNull(counter.getCounter());
        assertEquals(counter.getCounter(),0);
    }

    @Test
    void updateCounter(){
        for (int i = 0; i < 50; i++) {
            counter.doAction();
        }
        assertEquals(counter.getCounter(),50);
    }
}