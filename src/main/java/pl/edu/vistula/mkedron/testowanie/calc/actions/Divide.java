package pl.edu.vistula.mkedron.testowanie.calc.actions;

import static pl.edu.vistula.mkedron.testowanie.counter.CONSTS.MAX_SUM;

public class Divide extends Operation<Float> {

    private Float maxSize = new Float(100000);

    public Float getMaxValue() {
        return maxSize;
    }

    protected Float calculate(Float a, Float b) {
        if(b == 0) {
            return null;
        }
        return a/b;
    }

    protected boolean isMaxExceeded(Float result) {
        return false;
    }
}
