package pl.edu.vistula.mkedron.testowanie.calc;

import pl.edu.vistula.mkedron.testowanie.calc.actions.Multiplicity;
import pl.edu.vistula.mkedron.testowanie.calc.actions.Sum;
import pl.edu.vistula.mkedron.testowanie.counter.Counter;
import pl.edu.vistula.mkedron.testowanie.counter.OutOfRangeException;

public class Calc {
    private Counter counter;

    private Sum sum;
    private Multiplicity multiplicity;


    public Calc() {
        counter = new Counter();
        sum = new Sum();
        multiplicity = new Multiplicity();
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

}
