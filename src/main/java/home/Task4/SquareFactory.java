package home.Task4;

public class SquareFactory extends ShapeFactory {

    private int side;

    @Override
    public Square getShape(){
        Square square = new Square(side);
        return square;
    }

    private int getSide() {
        System.out.println("Введите сторону квадрата");
        side = scan.nextInt();
        return side;
    }

    SquareFactory() {
        side = getSide();
        getShape();
    }
}
