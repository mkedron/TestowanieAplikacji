package pl.edu.vistula.mkedron.testowanie.calc.actions;

import static pl.edu.vistula.mkedron.testowanie.counter.CONSTS.MAX_SUM;

public class Multiplicity extends Operation<Integer> {
    public Integer getMaxValue() {
        return MAX_SUM;
    }

    protected Integer calculate(Integer a, Integer b) {
        return a*b;
    }

    protected boolean isMaxExceeded(Integer result) {
        return getMaxValue() < result;
    }
}
