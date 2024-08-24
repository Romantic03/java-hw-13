package app;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(7),
                new Square(5),
                new Triangle(3, 4)
        };
        System.out.println("Total area: " + getTotalArea(shapes));
    }

    public static double getTotalArea(Shape[] shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.getArea();
        }
        return area;

    }
}