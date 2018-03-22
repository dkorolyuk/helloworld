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
    private float Square;
    private float perimeter;

    @Override
    public float getSquare(){
        Square = side * side;
        return Square;
    }

    @Override
    public float getPerimeter() {
        perimeter = side * 4;
        return perimeter;
    }

    @Override
    public String toString() {
        return ("Square = " + Square + "; " + "Perimeter = " + perimeter);
    }

    private int getSide() {
        System.out.println("Введите сторону квадрата");
        side = scan.nextInt();
        return side;
    }

    Square() {
        side = getSide();
        getPerimeter();
        getSquare();
    }
}
