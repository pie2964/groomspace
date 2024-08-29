package java03_2;

public class Exp3 {
    public static void main(String[] args) {
        // 다양한 도형 객체 생성
        ShapeAbstract[] shapes = new ShapeAbstract[3];
        shapes[0] = new Circle(5.0);          // 반지름 5.0인 원
        shapes[1] = new Rectangle(4.0, 6.0);  // 너비 4.0, 높이 6.0인 사각형
        shapes[2] = new Triangle(4.0, 5.0);   // 밑변 4.0, 높이 5.0인 삼각형

        // 배열에 저장된 각 도형의 면적을 계산하여 출력
        for (ShapeAbstract shape : shapes) {
            String shapeName = shape.getClass().getSimpleName();
            System.out.println("Shape: " + shapeName);
            System.out.println("Area: " + shape.calculateArea());
            System.out.println();
        }
    }
}
