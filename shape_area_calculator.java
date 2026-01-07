import java.util.Scanner;

// Abstract class defining the shape interface
abstract class Shape {
    abstract double area();
}

// Square
class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

// Circle
class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Triangle
class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

// Trapezoid
class Trapezoid extends Shape {
    private int base1;
    private int base2;
    private int height;

    public Trapezoid(int base1, int base2, int height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * (base1 + base2) * height;
    }
}

// Main program
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side of square:");
        int squareSide = sc.nextInt();

        System.out.println("Enter radius of circle:");
        int circleRadius = sc.nextInt();

        System.out.println("Enter base and height of triangle:");
        int triBase = sc.nextInt();
        int triHeight = sc.nextInt();

        System.out.println("Enter two bases and height of trapezoid:");
        int trapBase1 = sc.nextInt();
        int trapBase2 = sc.nextInt();
        int trapHeight = sc.nextInt();

        Shape square = new Square(squareSide);
        Shape circle = new Circle(circleRadius);
        Shape triangle = new Triangle(triBase, triHeight);
        Shape trapezoid = new Trapezoid(trapBase1, trapBase2, trapHeight);

        System.out.printf("Area of Square: %.2f%n", square.area());
        System.out.printf("Area of Circle: %.2f%n", circle.area());
        System.out.printf("Area of Triangle: %.2f%n", triangle.area());
        System.out.printf("Area of Trapezoid: %.2f%n", trapezoid.area());
    }
}