package home.Task4;

public class TriangleFactory extends ShapeFactory {
    private int sideLeft = getSideLeft();
    private int sideRight = getSideRight();
    private int sideBase = getSideBase();

    @Override
    public Triangle getShape() {
        Triangle triangle = new Triangle(sideLeft, sideRight, sideBase);
        return triangle;
    }

    private int getSideLeft(){
        System.out.println("Введите левую грань треугольника");
        sideLeft = scan.nextInt();
        return sideLeft;
    }

    private int getSideRight(){
        System.out.println("Введите правую грань треугольника");
        sideRight = scan.nextInt();
        return sideRight;
    }

    private int getSideBase(){
        System.out.println("Введите основание треугольника");
        sideBase = scan.nextInt();
        return sideBase;
    }
    TriangleFactory () {
        getShape();
    }
}
