package home.Task4;

public class SquareFactory extends ShapeFactory {
    int side;
    @Override
    public Square getShape(){
        Square square = new Square();
        return square;
    }

}
