package day0829;

import java.util.Scanner;

public class LoginMain {
    public static void main(String[] args) {
        LoginController controller = new LoginController();
        Scanner scanner = new Scanner(System.in);
        String id,password;
        boolean result = false;

        while(true){
            //id pw 값 입력
            System.out.print("아이디 입력 :");
            id = scanner.next();
            System.out.print("패스워드 입력 : ");
            password = scanner.next();
            //컨트롤러 메소드 전달받음
            result = controller.loginCheck(id, password);
            //결과값에 따라 다른 값
            if(result){
                System.out.println("LoginMain : 로그인 성공");
                System.out.println("프로그램 종료");
                break;
            }
            else {
                System.out.println("LoginMain : 로그인 실패");
                System.out.println();
                System.out.println("다시 입력하세요");
            }

        }



        scanner.close();
    }
}
