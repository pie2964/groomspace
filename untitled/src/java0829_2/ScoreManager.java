package java0829_2;
import java.util.HashMap;
import java.util.Scanner;

public class ScoreManager {
    public static void main(String[] args) {
        // HashMap 선언
        HashMap<String, Integer> studentScores = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // 메뉴 출력
            System.out.println("=== 학생 점수 관리 프로그램 ===");
            System.out.println("1. 학생 점수 추가");
            System.out.println("2. 학생 점수 조회");
            System.out.println("3. 학생 점수 삭제");
            System.out.println("4. 모든 학생의 점수 출력");
            System.out.println("5. 프로그램 종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // 개행 문자 제거

            switch (choice) {
                case 1:
                    // 학생 점수 추가
                    System.out.print("학생 이름: ");
                    String name = scanner.nextLine();
                    System.out.print("학생 점수: ");
                    int score = scanner.nextInt();
                    studentScores.put(name, score);
                    System.out.println(name + " 학생의 점수가 추가되었습니다.");
                    break;

                case 2:
                    // 학생 점수 조회
                    System.out.print("조회할 학생 이름: ");
                    String studentToView = scanner.nextLine();
                    if (studentScores.containsKey(studentToView)) {
                        System.out.println(studentToView + " 학생의 점수: " + studentScores.get(studentToView));
                    } else {
                        System.out.println(studentToView + " 학생의 데이터가 없습니다.");
                    }
                    break;

                case 3:
                    // 학생 점수 삭제
                    System.out.print("삭제할 학생 이름: ");
                    String studentToDelete = scanner.nextLine();
                    if (studentScores.containsKey(studentToDelete)) {
                        studentScores.remove(studentToDelete);
                        System.out.println(studentToDelete + " 학생의 점수가 삭제되었습니다.");
                    } else {
                        System.out.println(studentToDelete + " 학생의 데이터가 없습니다.");
                    }
                    break;

                case 4:
                    // 모든 학생의 점수 출력
                    System.out.println("=== 모든 학생의 점수 ===");
                    for (String student : studentScores.keySet()) {
                        System.out.println(student + ": " + studentScores.get(student));
                    }
                    break;

                case 5:
                    // 프로그램 종료
                    running = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;

                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
            System.out.println();
        }

        scanner.close();
    }
}
