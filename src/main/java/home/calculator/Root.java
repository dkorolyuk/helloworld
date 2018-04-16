package home.calculator;

public class Root implements BinaryOperation {
    public double resultFor(double left, double right) throws PredicateException{
        if (right < 0) {
            throw new PredicateException("right predicate cannot be less than 0");
        }
        return Math.pow(right,1.0/left);
    }
}
