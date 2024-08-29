package java02;
// Rectangle 클래스 정의
class Rectangle {
    // 필드: 가로와 세로 길이
    private double width;
    private double height;

    // 생성자: 가로와 세로 길이를 초기화
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 넓이를 계산하는 메서드
    public double calculateArea() {
        return width * height;
    }

    // 둘레를 계산하는 메서드
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

// Main 클래스에서 실행
public class Exp1 {
    public static void main(String[] args) {
        // 직사각형 객체 생성
        Rectangle rect = new Rectangle(5.0, 3.0);

        // 넓이와 둘레 계산
        double area = rect.calculateArea();
        double perimeter = rect.calculatePerimeter();

        // 결과 출력
        System.out.println("넓이: " + area);
        System.out.println("둘레: " + perimeter);
    }
}
