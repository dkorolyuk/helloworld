package home.Task4;

public class CircleFactory extends ShapeFactory {
    public int radius;

    @Override
    public Circle getShape(){
        Circle circle = new Circle();
        return circle;
    }

}




