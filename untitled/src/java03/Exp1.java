package java03;

// 1. Shape 인터페이스 정의
interface Shape {
    // 도형의 면적을 계산하는 메서드
    double calculateArea();
}

// 2. Circle 클래스 작성
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// 2. Rectangle 클래스 작성
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// 2. Triangle 클래스 작성
class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// 3. 메인 클래스 작성 및 실행
public class Exp1 {
    public static void main(String[] args) {
        // Circle 객체 생성 및 면적 계산
        Shape circle = new Circle(5.0);
        System.out.println("Circle Area: " + circle.calculateArea());

        // Rectangle 객체 생성 및 면적 계산
        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        // Triangle 객체 생성 및 면적 계산
        Shape triangle = new Triangle(4.0, 5.0);
        System.out.println("Triangle Area: " + triangle.calculateArea());
    }
}
