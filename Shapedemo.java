abstract class Shape {
    abstract void area();
    abstract void perimeter();
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }

    void perimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + width)));
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    void perimeter() {
        System.out.println("Perimeter of Circle: " + (2 * Math.PI * radius));
    }
}

class Triangle extends Shape {
    double base, height, side1, side2, side3;

    Triangle(double b, double h, double s1, double s2, double s3) {
        this.base = b;
        this.height = h;
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    void area() {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }

    void perimeter() {
        System.out.println("Perimeter of Triangle: " + (side1 + side2 + side3));
    }
}

class Square extends Shape {
    double side;

    Square(double s) {
        this.side = s;
    }

    void area() {
        System.out.println("Area of Square: " + (side * side));
    }

    void perimeter() {
        System.out.println("Perimeter of Square: " + (4 * side));
    }
}

class Cone extends Shape {
    double radius, slantHeight;

    Cone(double r, double l) {
        this.radius = r;
        this.slantHeight = l;
    }

    void area() {
        double area = Math.PI * radius * (radius + slantHeight);
        System.out.println("Surface Area of Cone: " + area);
    }

    void perimeter() {
        System.out.println("Base Circumference of Cone: " + (2 * Math.PI * radius));
    }
}

class Rhombus extends Shape {
    double side, diagonal1, diagonal2;

    Rhombus(double s, double d1, double d2) {
        this.side = s;
        this.diagonal1 = d1;
        this.diagonal2 = d2;
    }

    void area() {
        System.out.println("Area of Rhombus: " + (0.5 * diagonal1 * diagonal2));
    }

    void perimeter() {
        System.out.println("Perimeter of Rhombus: " + (4 * side));
    }
}

public class Shapedemo {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Rectangle(12, 23),
                new Circle(7),
                new Triangle(10, 8, 6, 8, 10),
                new Square(5),
                new Cone(3, 10),
                new Rhombus(5, 8, 6)
        };

        for (Shape s : shapes) {
            s.area();
            s.perimeter();
            System.out.println("--------------------");
        }
    }
}