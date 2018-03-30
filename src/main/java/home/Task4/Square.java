package home.Task4;


/**
Нужно переопределить в каждой фигуре метод toString()
который будет отображать строку с информацией о фигуре
**/
public class Square extends Shape{
    //Фабрика не должна быть тут
    //поле должно быть private
    //должно заполняться в конструкторе
    //через аргумент!

    private int side;

    @Override
    public float getSquare(){
        return side * side;
    }

    @Override
    public float getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return ("Square = " + getSquare() + "; " + "Perimeter = " + getPerimeter());
    }


    Square(int side) {
        this.side = side;
    }
}
