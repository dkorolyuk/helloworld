package home.Task4;

public class Circle extends Shape{
    private int radius;
    private float square;
    private float perimeter;


    @Override
    public float getSquare(){
        square = radius * radius * 3.14f;
        return square;
    }

    @Override
    public float getPerimeter() {
        perimeter = 2*3.14f*radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return ("Square = " + square + "; " + "Perimeter = " + perimeter);
    }


    Circle(int radius) {
        this.radius = radius;
        getPerimeter();
        getSquare();
    }

}
