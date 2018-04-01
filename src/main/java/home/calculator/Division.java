package home.calculator;

public class Division implements BinaryOperation {
    public double resultFor(double left, double right) throws PredicateException {
        if (right == 0) throw new PredicateException("Can not be divided into 0");
        return left/right;
    }
}
