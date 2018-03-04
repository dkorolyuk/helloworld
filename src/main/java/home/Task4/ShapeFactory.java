package home.Task4;

import java.util.Scanner;

public abstract class ShapeFactory {
    //поле должено быть protected
    Scanner scan = new Scanner(System.in);

    /**
    Метод должен врзвращат Shape и должен быть абстрактным
    а реализация в классе-фабрики конкретной фигуры
    **/
    public int getShape(){
        return 0;
    }
}
