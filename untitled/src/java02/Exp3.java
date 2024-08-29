package java02;
// 추상 클래스 Shape 정의
abstract class Shape {
    // 추상 메서드: 면적을 계산하는 메서드
    public abstract double calculateArea();
}

// 원 클래스 정의 (Shape 상속)
class Circle extends Shape {
    private double radius; // 반지름

    // 생성자: 반지름 초기화
    public Circle(double radius) {
        this.radius = radius;
    }

    // 면적 계산 메서드 구현
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// 사각형 클래스 정의 (Shape 상속)
class Rectanglee extends Shape {
    private double width;  // 가로
    private double height; // 세로

    // 생성자: 가로와 세로 길이 초기화
    public Rectanglee(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 면적 계산 메서드 구현
    @Override
    public double calculateArea() {
        return width * height;
    }
}

// 삼각형 클래스 정의 (Shape 상속)
class Triangle extends Shape {
    private double base;   // 밑변
    private double height; // 높이

    // 생성자: 밑변과 높이 초기화
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // 면적 계산 메서드 구현
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main 클래스에서 실행
public class Exp3 {
    public static void main(String[] args) {
        // 도형 객체들을 배열에 저장
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);        // 반지름 5인 원
        shapes[1] = new Rectanglee(4, 6);  // 가로 4, 세로 6인 사각형
        shapes[2] = new Triangle(4, 7);   // 밑변 4, 높이 7인 삼각형

        // 각 도형의 면적을 계산하여 출력
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("도형 " + (i+1) + "의 면적: " + shapes[i].calculateArea());
        }
    }
}
