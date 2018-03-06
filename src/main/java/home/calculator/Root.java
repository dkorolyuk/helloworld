package home.calculator;

public class Root implements BinaryOperation {
    public double resultFor(double left, double right) {
        return Math.pow(right,1.0/left);
    }
}
