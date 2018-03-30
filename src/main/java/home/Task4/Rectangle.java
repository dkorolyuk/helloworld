package home.Task4;

public class Rectangle extends Shape {
    //
    private int Hight;
    private int Width;

    @Override
    public float getSquare(){
        return Hight * Width;
    }

    @Override
    public float getPerimeter() {
        return  2 * Hight + 2 * Width;
    }

    @Override
    public String toString() {
        return ("Square = " + getSquare() + "; " + "Perimeter = " + getPerimeter());
    }


    Rectangle(int Hight, int Width) {
        this.Hight = Hight;
        this.Width = Width;
    }

}
