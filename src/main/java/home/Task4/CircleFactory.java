package home.Task4;

public class CircleFactory extends ShapeFactory {

    private int getRadius() {
        System.out.println("Введите радиус");
        return scan.nextInt();
    }

    @Override
    public Circle getShape(){
        int radius = getRadius();
        return new Circle(radius);
    }

}




