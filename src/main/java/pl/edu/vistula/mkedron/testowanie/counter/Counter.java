package pl.edu.vistula.mkedron.testowanie.counter;

import static pl.edu.vistula.mkedron.testowanie.counter.CONSTS.MAX_COUNTER;
import static pl.edu.vistula.mkedron.testowanie.counter.CONSTS.MIN_COUNTER;

public class Counter {

    private int counter;
    private int min = MIN_COUNTER;
    private int max = MAX_COUNTER;


    public Counter() {
        super();
    }

    public Counter(int initCounter) {
        this.counter = initCounter;
        isCounterOutOfBound();
    }

    public int getCounter() {
        return counter;
    }

    private boolean isCounterOutOfBound() {
        if(counter < min) {
            return true;
        }

        if(counter > max) {
            return true;
        }

        return false;
    }

    public void doAction() {
        counter++;
        isCounterOutOfBound();
    }

}
