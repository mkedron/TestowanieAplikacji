package pl.edu.vistula.mkedron.testowanie.calc.actions;

public abstract class Operation<T extends Number> {

    public T getResult(T a, T b) {
        T result = calculate(a,b);
        if(isMaxExceeded(result)) {
            return null;
        }
        return result;
    };

    public abstract T getMaxValue();

    protected abstract T calculate(T a, T b);

    protected abstract boolean isMaxExceeded(T result);
}
