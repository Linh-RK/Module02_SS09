package ex04.rikkei.academy;

public class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle() {}

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String display() {
        return "Hinh chu nhat co mau " + getColor();
    };

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
