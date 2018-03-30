package home.Task4;

public class SquareFactory extends ShapeFactory {

    @Override
    public Square getShape(){
        int side = getSide();
        return new Square(side);
}

    private int getSide() {
        System.out.println("Введите сторону квадрата");
        return scan.nextInt();
    }
}
