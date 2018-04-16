package home.calculator;


import java.util.Scanner;

public class Parser {

    public String[] expressionParser() throws ParserException {
        String expression;
        System.out.println("Введите выражение");
        Scanner scan = new Scanner(System.in);
        expression = scan.nextLine();
        if (!expression.contains(" ")){
            throw new ParserException("Please use whitespace between your parameters");
        }

        String [] expArr = expression.split(" ");
        if (expArr.length != 3) {
            throw new ParserException("Please make sure that you enter all needed parameters with whitespace as splitter");
        }
        return expArr;
    }
    public double getVal1(String[] expArr){
       return Double.valueOf(expArr[0]);
    }
    public double getVal2(String[] expArr) {
        return Double.valueOf(expArr[2]);
    }

    public String getOperator(String[] expArr) {
       return expArr[1];
    }

}
