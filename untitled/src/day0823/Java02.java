package day0823;

import java.util.Scanner;

public class Java02 {
    //배열 평균
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    // 배열요소변경
    public static void changeElement(int[] array, int index, int newValue) {
        if (index >= 0 && index < array.length) {
            array[index] = newValue;
        } else {
            System.out.println("Invalid index.");
        }
    }
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // 평균 계산
        double average = calculateAverage(numbers);
        System.out.println("배열의 평균: " + average);

        // 배열 요소 변경
        changeElement(numbers, 2, 100);
        System.out.println("변경된 배열: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }


  //     Scanner scanner = new Scanner(System.in);
//        int a = 0;
//        int b = 0;
//        System.out.println("정수 2개를 입력하세요");
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        System.out.println("두 정수의 합 : "+(a+b));
//        System.out.println("두 정수의 차 : "+(a-b));


//        System.out.println("이름을 입력하세요 : ");
//        String name = scanner.nextLine();
//        System.out.println("나이를 입력하세요 : ");
//        int a = scanner.nextInt();
//        System.out.printf("이름 : %s , 나이 : %d",name,a);

    }
}
