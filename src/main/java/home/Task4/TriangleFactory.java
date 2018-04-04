package home.Task4;

public class TriangleFactory extends ShapeFactory {


    @Override
    public Triangle getShape() {
        int sideLeft = getSideLeft();
        int sideRight = getSideRight();
        int sideBase = getSideBase();
        return new Triangle(sideLeft, sideRight, sideBase);
    }

    private int getSideLeft(){
        System.out.println("Введите левую грань треугольника");
        return scan.nextInt();
    }

    private int getSideRight(){
        System.out.println("Введите правую грань треугольника");
        return scan.nextInt();
    }

    private int getSideBase(){
        System.out.println("Введите основание треугольника");
        return scan.nextInt();
    }
}
