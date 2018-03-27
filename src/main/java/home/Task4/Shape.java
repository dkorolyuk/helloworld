package home.Task4;

import java.util.Scanner;

public abstract class Shape {
    /**
    Метод должен быть абстрактным а реализация в классе конкретной фигуры
    **/
    abstract public float getSquare();
    
    /**
    Метод должен быть абстрактным а реализация в классе конкретной фигуры
    **/
    abstract public float getPerimeter();

    @Override
    public String toString() {
        return super.toString();
    }

}
