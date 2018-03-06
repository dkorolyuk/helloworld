package home.Task4;

public abstract class Shape {
    /**
    Поля не нужны 
    **/
    public float square;
    public float perimeter;

    /**
    Метод должен быть абстрактным а реализация в классе конкретной фигуры
    **/
    public float getSquare(){
        System.out.println("Площадь = " + square);
        return square;
    }
    
    /**
    Метод должен быть абстрактным а реализация в классе конкретной фигуры
    **/
    public float getPerimeter() {
        System.out.println("периметр = " + perimeter);
        return perimeter;
    }
}
