package ex04.rikkei.academy;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("do",5);
        Shape rectangle = new Rectangle("hong",3,5);
        System.out.printf("%.2f \n",circle.getArea());
        System.out.println(circle.display());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.display());
    }
}
