package home.calculator;

public class Exponentiation implements BinaryOperation {
    public double resultFor(double left, double right) {
        return Math.pow(left, right);
    }
}
