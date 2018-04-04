package home.Task4;

public class Circle extends Shape{
    //
    private int radius;


    @Override
    public float getSquare(){
        return radius * radius * 3.14f;
    }

    @Override
    public float getPerimeter() {
        return  2*3.14f*radius;
    }

    @Override
    public String toString() {
        return ("Square = " + getSquare() + "; " + "Perimeter = " + getPerimeter());
    }


    Circle(int radius) {
        this.radius = radius;
    }

}
