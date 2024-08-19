package ex02;

import ex02.Circle;
import ex02.Rectangle;
import ex02.Shape;
import ex02.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0]= new Circle(3);
        shapes[1]= new Rectangle(3,5);
        shapes[2]= new Square(4);
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.printf(" Area  :  %.2f | Perimeter  : %.2f \n", ((Circle) shape).getArea(), ((Circle) shape).getPerimeter());
            }
            if (shape instanceof Rectangle && !(shape instanceof Square)) {
                System.out.printf(" Area  :  %.2f | Perimeter  : %.2f \n", ((Rectangle) shape).getArea(), ((Rectangle) shape).getPerimeter());
            }
            if (shape instanceof Square) {
                System.out.printf(" Area  :  %.2f | Perimeter  : %.2f \n", ((Square) shape).getArea(), ((Square) shape).getPerimeter());
                ((Square) shape).howToColor();
            }
        }
    }
}
