package home.Task4;

public class Triangle extends Shape {
    private int sideLeft;
    private int sideRight;
    private int sideBase;



    @Override
    public float getPerimeter() {
        return sideLeft + sideRight + sideBase;
    }

    @Override
    public float getSquare(){
        return  (float) Math.sqrt(getPerimeter()/2 * (getPerimeter()/2 - sideLeft) * (getPerimeter()/2 - sideRight) * (getPerimeter()/2 - sideBase));
    }

    @Override
    public String toString() {
        return ("Square = " + getSquare() + "; " + "Perimeter = " + getPerimeter());
    }



    Triangle ( int sideLeft, int sideRight, int sideBase) {
        this.sideLeft = sideLeft;
        this.sideRight = sideRight;
        this.sideBase = sideBase;
    }
}
