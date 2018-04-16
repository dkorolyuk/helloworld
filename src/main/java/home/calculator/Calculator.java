package home.calculator;

/**
 *
 * @author Andrey
 */

public class Calculator {

    public double calculate(double val1, double val2, String operator) throws PredicateException {
        BinaryOperation operation = null;
        try{operation = getOperationFor(operator);}
        catch (OperatorException oe){
            System.err.println(oe.toString());
        }
                return operation.resultFor(val1, val2);
    }



    private BinaryOperation getOperationFor(String operator)throws OperatorException{

        switch (operator) {
            case "*":
                return new Multiplication();
            case "-":
                return new Substraction();
            case "+":
                return new Addition();
            case "^":
                return new Exponentiation();
            case "log":
                return new Logarithm();
            case "sqrt":
                return new Root();
            case "/":
                return new Division();
            default:
                throw new OperatorException("Unknown operator");
                //return null;
        }
    }



    public static void main(String[] args) {
        Parser parser = new Parser();
        double val1 = 0.0;
        double val2 = 0.0;
        String operator = null;
        String[] expression = null;
        try {expression = parser.expressionParser();}
        catch (ParserException pe){
            System.err.println(pe.toString());
        }
        try {val1 = parser.getVal1(expression);}
        catch (NumberFormatException nfe) {
            System.err.println("Incorrect predicate1");
        }
        try {val2 = parser.getVal2(expression);}
        catch (NumberFormatException nfe) {
            System.err.println("Incorrect predicate2");
        }
        operator = parser.getOperator(expression);

        Calculator calculator = new Calculator();
        try {System.out.println( calculator.calculate(val1, val2, operator) );}
        catch (NullPointerException npe) {
            System.err.println("Cannot count without correct expression");
        }
        catch (PredicateException pre) {
            System.err.println(pre.toString());
        }
    }
}