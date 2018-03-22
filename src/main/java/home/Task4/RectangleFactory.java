package home.Task4;

public class RectangleFactory extends ShapeFactory {
    int Hight;
    int Width;
    @Override
    public Rectangle getShape(){
        Rectangle rectangle = new Rectangle();
        return rectangle;
    }

}
