package home.calculator;

import java.util.Scanner;

/**
 *
 * @author Andrey
 */

public class Calculator {

    public double calculate(double val1, double val2, String operator) {
        BinaryOperation operation = getOperationFor(operator);
        if (operation == null) {
            System.out.println("Неизвестный оператор " + operator);
            return Double.NaN;
        }
        return operation.resultFor(val1, val2);
    }



    private BinaryOperation getOperationFor(String operator) {
       /*if ("*".equals(operator)) {
            return new Multiplication();
        } else if ("-".equals(operator)) {
            return new Substraction();
        }*/
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
                return null;
        }
    }



    public static void main(String[] args){
        String expression;
        System.out.println("Введите выражение");
        Scanner scan = new Scanner(System.in);
        expression = scan.nextLine();
        String [] expArr = expression.split(" ");
        double val1 = Double.valueOf(expArr[0]);
        double val2 = Double.valueOf(expArr[2]);
        String operator = expArr[1];

        Calculator calculator = new Calculator();
        System.out.println( calculator.calculate(val1, val2, operator) );
    }
}