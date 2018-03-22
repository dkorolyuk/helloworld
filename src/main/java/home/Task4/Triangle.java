package home.Task4;

public class Triangle extends Shape {
    private int sideLeft;
    private int sideRight;
    private int sideBase;
    private float square;
    private float perimeter;

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

    @Override
    public float getPerimeter() {
        perimeter = sideLeft + sideRight + sideBase;
        return perimeter;
    }

    @Override
    public float getSquare(){
        square = (float) Math.sqrt(perimeter/2 * (perimeter/2 - sideLeft) * (perimeter/2 - sideRight) * (perimeter/2 - sideBase));
        return square;
    }

    @Override
    public String toString() {
        return ("Square = " + square + "; " + "Perimeter = " + perimeter);
    }



    Triangle () {
        sideLeft = getSideLeft();
        sideRight = getSideRight();
        sideBase = getSideBase();
        getPerimeter();
        getSquare();
    }
}
