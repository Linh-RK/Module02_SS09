package ex01;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(3,5);
        shapes[2] = new Square(5);
        for (int i = 0; i < shapes.length; i++) {
            double random = Math.floor(Math.random() * 101);
            if(shapes[i] instanceof Circle){
//                System.out.println("Before resize: area:" + ((Circle)shapes[i]).getArea() +" , and perimeter: "+ ((Circle) shapes[i]).getPerimeter());
                System.out.printf("Circle before percent: %.2f | Area after :  %.2f | Perimeter after : %.2f \n", 0.0, ((Circle)shapes[i]).getArea(), ((Circle) shapes[i]).getPerimeter());
                if(shapes[i] instanceof Resizable){
                    ((Resizable)shapes[i]).resize(random);
                };
//                System.out.println("After resize with "+random+" percent: " + ((Circle)shapes[i]).getArea() +" , and perimeter: "+ ((Circle) shapes[i]).getPerimeter());
                System.out.printf("Circle resize percent: %.2f | Area after :  %.2f | Perimeter after : %.2f \n", random, ((Circle)shapes[i]).getArea(), ((Circle) shapes[i]).getPerimeter());
            }
            if(shapes[i] instanceof Rectangle){
//                System.out.println("Before resize: area:" + ((Rectangle)shapes[i]).getArea() +" , and perimeter: "+ ((Rectangle) shapes[i]).getPerimeter());
                System.out.printf("Rectangle before percent: %.2f | Area after :  %.2f | Perimeter after : %.2f \n", 0.0, ((Rectangle)shapes[i]).getArea(), ((Rectangle) shapes[i]).getPerimeter());

                if(shapes[i] instanceof Resizable){
                    ((Resizable)shapes[i]).resize(random);
                }
//                System.out.println("After resize with "+random+" percent: " + ((Rectangle)shapes[i]).getArea() +" , and perimeter: "+ ((Rectangle) shapes[i]).getPerimeter());
                System.out.printf("Rectangle resize percent: %.2f | Area after :  %.2f | Perimeter after : %.2f \n", random, ((Rectangle)shapes[i]).getArea(), ((Rectangle) shapes[i]).getPerimeter());
            }
            if(shapes[i] instanceof Square){
//                System.out.println("Before resize: area:" + ((Square)shapes[i]).getArea() +" , and perimeter: "+ ((Square) shapes[i]).getPerimeter());
                System.out.printf("Square before percent: %.2f | Area after :  %.2f | Perimeter after : %.2f \n", 0.0, ((Square)shapes[i]).getArea(), ((Square) shapes[i]).getPerimeter());
                if(shapes[i] instanceof Resizable){
                    ((Resizable)shapes[i]).resize(random);
                }
//                System.out.println("After resize with "+random+" percent: " + ((Square)shapes[i]).getArea() +" , and perimeter: "+ ((Square) shapes[i]).getPerimeter());
                System.out.printf("Square resize percent: %.2f | Area after :  %.2f | Perimeter after : %.2f \n", random, ((Square)shapes[i]).getArea(), ((Square) shapes[i]).getPerimeter());
            }
        }

//Kiểm thử Class Shape
//        System.out.println("-------- - SHAPE----------");
//
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("red", false);
//        System.out.println(shape);

//kiểm thử Class Circle
//        System.out.println("-------- - CIRCLE----------");
//
//        Circle circle = new Circle();
//        System.out.println(circle);
//
//        circle = new Circle(3.5);
//        System.out.println(circle);
//
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);
//Kiểm thử RECTANGLE
//        System.out.println("---------RECTANGLE----------");
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.5, 3.8, "orange", true);
//        System.out.println(rectangle);
//Kiểm thử SQUARE
//        System.out.println("---------SQUARE----------");
//
//        Square square = new Square();
//        System.out.println(square);
//
//        square = new Square(2.3);
//        System.out.println(square);
//
//        square = new Square(5.8, "yellow", true);
//        System.out.println(square);
    }

}

