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
            default:
                return null;
        }
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double val1;
        double val2;
        String operator;
        String expresion;
        System.out.println("Введите выражение");
        expresion = scan.nextLine();
        String [] expArr = expresion.split(" ");
        val1 = Double.valueOf(expArr[0]);
        val2 = Double.valueOf(expArr[2]);
        operator = expArr[1];

        Calculator calculator = new Calculator();
        System.out.println( calculator.calculate(val1, val2, operator) );
        //System.out.println( calculator.calculate(456.546, 545.5465, "*") );
        //System.out.println( calculator.calculate(456.546, 545.5465, "-") );
    }
}