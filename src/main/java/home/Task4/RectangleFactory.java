package home.Task4;

public class RectangleFactory extends ShapeFactory {

    @Override
    public Rectangle getShape(){
        int Hight = getHight();
        int Width = getWidth();
        return new Rectangle(Hight, Width);
    }
    private int getHight(){
        System.out.println("Введите высоту прямоугольника");
        return scan.nextInt();
    }

    private int getWidth(){
        System.out.println("Введите ширину прямоугольника");
        return scan.nextInt();
    }
}
