package pl.edu.vistula.mkedron.testowanie.calc.actions;

import static pl.edu.vistula.mkedron.testowanie.counter.CONSTS.MAX_SUM;

public class Sum extends Operation<Integer>{

    private int maxResult = MAX_SUM;


    public Integer getMaxValue() {
        return maxResult;
    }

    protected Integer calculate(Integer a, Integer b) {
        return a+b;
    }

    protected boolean isMaxExceeded(Integer result) {
        return getMaxValue() < result;
    }
}
