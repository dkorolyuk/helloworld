package home.Task4;

public class Rectangle extends Shape {
    private int Hight;
    private int Width;
    private float square;
    private float perimeter;

    @Override
    public float getSquare(){
        square = Hight * Width;
        return square;
    }

    @Override
    public float getPerimeter() {
        perimeter = 2 * Hight + 2 * Width;
        return perimeter;
    }

    @Override
    public String toString() {
        return ("Square = " + square + "; " + "Perimeter = " + perimeter);
    }
    private int getHight(){
        System.out.println("Введите высоту прямоугольника");
        Hight = scan.nextInt();
        return Hight;
    }

    private int getWidth(){
        System.out.println("Введите ширину прямоугольника");
        Width = scan.nextInt();
        return Width;
    }

    Rectangle() {
        Hight = getHight();
        Width = getWidth();
        getPerimeter();
        getSquare();
    }

}
