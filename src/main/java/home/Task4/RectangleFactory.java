package home.Task4;

public class RectangleFactory extends ShapeFactory {
    int Hight;
    int Width;
    @Override
    public Rectangle getShape(){
        Rectangle rectangle = new Rectangle();
        return rectangle;
    }

    /*public int getHight(){
        System.out.println("Введите высоту прямоугольника");
        Hight = scan.nextInt();
        return Hight;
    }

    public int getWidth(){
        System.out.println("Введите ширину прямоугольника");
        Width = scan.nextInt();
        return Width;
    }*/
}
