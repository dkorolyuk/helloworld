package home.Task4;

import java.util.Scanner;

//check commit

public class LastClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите фигуру:1 - круг; 2 - квадрат; 3 - прямоугольник; 4 - треугольник " );
        int shapeNum = scan.nextInt();
        //Вот тут должно быть 
        ShapeFactory shapeFactory = null;
        switch (shapeNum){
            case 1:
                shapeFactory = new CircleFactory();
                //Circle circle = new Circle();
                break;
            case 2:
                shapeFactory = new SquareFactory();
                //Square square = new Square();
                break;
            case 3:
                shapeFactory = new RectangleFactory();
                //Rectangle rectangle = new Rectangle();
                break;
            case 4:
                shapeFactory = new TriangleFactory();
                //Triangle triangle = new Triangle();
                break;
            default:
                System.out.println("Я не знаю такую фигуру");

        }
        //Далее создаем конкретную фигуру через конкретную фабрику 
        //но переменные у нас абстрактыне         
        Shape shape = shapeFactory.getShape();
                
        //И вот тут выводим периметр и площадь вызвая методы у shape
        System.out.println(shape.toString());
    }
}
