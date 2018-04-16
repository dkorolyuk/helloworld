package home.calculator;

public class OperatorException extends ParserException {    
    public void OperatorExeption() {
        //ненадо ничего выводить в консоль в конструкторе исключений
        System.err.println("Unknown operator");
    }
}
