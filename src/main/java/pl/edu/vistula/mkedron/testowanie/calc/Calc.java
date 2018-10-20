package pl.edu.vistula.mkedron.testowanie.calc;

import pl.edu.vistula.mkedron.testowanie.calc.actions.Divide;
import pl.edu.vistula.mkedron.testowanie.calc.actions.Multiplicity;
import pl.edu.vistula.mkedron.testowanie.calc.actions.Sum;
import pl.edu.vistula.mkedron.testowanie.counter.Counter;

public class Calc {
    private Counter counter;

    private Sum sum;
    private Multiplicity multiplicity;
    private Divide divide;


    public Calc() {
        counter = new Counter();
        sum = new Sum();
        multiplicity = new Multiplicity();
        divide = new Divide();
    }

    public Integer multiplicity(Integer a, Integer b){
        Integer result = multiplicity.getResult(a,b);
        counter.doAction();
        return result;
    }

    public Integer sum(Integer a, Integer b) {
        Integer result = sum.getResult(a,b);
        counter.doAction();
        return result;
    }

    public Float divide(Float a, Float b) {
        Float result = divide.getResult(a,b);
        counter.doAction();
        return result;
    }

    public Float divide(Integer a, Integer b) {
        Float result = divide.getResult(new Float(a), new Float(b));
        counter.doAction();
        return result;
    }

}
