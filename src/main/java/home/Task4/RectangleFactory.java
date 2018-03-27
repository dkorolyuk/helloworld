package home.Task4;

public class RectangleFactory extends ShapeFactory {
    private int Hight = getHight();
    private int Width = getWidth();
    @Override
    public Rectangle getShape(){
        Rectangle rectangle = new Rectangle(Hight, Width);
        return rectangle;
    }
    private int getHight(){
        System.out.println("Введите высоту прямоугольника");
        Hight = scan.nextInt();
        return Hight;
    }

    private int getWidth(){
        System.out.println("Введите ширину прямоугольника");
        Width = scan.nextInt();
        return Width;
    }

    RectangleFactory() {
        getShape();
    }
}
