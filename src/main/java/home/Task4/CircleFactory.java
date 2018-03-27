package home.Task4;

public class CircleFactory extends ShapeFactory {
    private int radius;

    private int getRadius() {
        System.out.println("Введите радиус");
        radius = scan.nextInt();
        return radius;
    }

    @Override
    public Circle getShape(){
        Circle circle = new Circle(radius);
        return circle;
    }

    CircleFactory() {
        getRadius();
        getShape();
    }

}




