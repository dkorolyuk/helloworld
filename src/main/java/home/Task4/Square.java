package home.Task4;

/**
Нужно переопределить в каждой фигуре метод toString()
который будет отображать строку с информацией о фигуре
**/
public class Square extends Shape{
    //Фабрика не должна быть тут
    SquareFactory sf = new SquareFactory();
    //поле должно быть private
    //должно заполняться в конструкторе 
    //через аргумент!
    int Side = sf.getShape();

    @Override
    public float getSquare(){
        square = Side * Side;
        System.out.println("Площадь = " + square);
        return square;
    }

    @Override
    public float getPerimeter() {
        perimeter = Side * 4;
        System.out.println("периметр = " + perimeter);
        return perimeter;
    }

    /**
    Зачем методы которые возвращают площадь и периметр вызывать в конструкторе?
    **/
    Square() {
        getSquare();
        getPerimeter();
    }
}
