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


    Rectangle(int Hight, int Width) {
        this.Hight = Hight;
        this.Width = Width;
        getPerimeter();
        getSquare();
    }

}
