import java.util.Scanner;

abstract class Shape {
    abstract void calculateArea();

    void display() {
        System.out.println("Area calculation");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class TestAbstract {
    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = sc.nextInt();
        Circle c = new Circle(r);
        c.display();
        c.calculateArea();
        
        System.out.print("Enter length : ");
        int l = sc.nextInt();
        System.out.print("Enter width : ");
        int w = sc.nextInt();
        
        Rectangle R = new Rectangle(l, w);
        R.display();
        R.calculateArea();
    }
}
