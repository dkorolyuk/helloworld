package home.Task4;

public class Triangle extends Shape {
    private int sideLeft;
    private int sideRight;
    private int sideBase;
    private float square;
    private float perimeter;



    @Override
    public float getPerimeter() {
        perimeter = sideLeft + sideRight + sideBase;
        return perimeter;
    }

    @Override
    public float getSquare(){
        square = (float) Math.sqrt(perimeter/2 * (perimeter/2 - sideLeft) * (perimeter/2 - sideRight) * (perimeter/2 - sideBase));
        return square;
    }

    @Override
    public String toString() {
        return ("Square = " + square + "; " + "Perimeter = " + perimeter);
    }



    Triangle ( int sideLeft, int sideRight, int sideBase) {
        this.sideLeft = sideLeft;
        this.sideRight = sideRight;
        this.sideBase = sideBase;
        getPerimeter();
        getSquare();
    }
}
