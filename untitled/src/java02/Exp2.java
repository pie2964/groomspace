package java02;
// 직원 클래스 정의
class Employee {
    // 필드: 이름, 연봉, 직급
    private String name;
    private double salary;
    private String position;

    // 생성자: 이름, 연봉, 직급 초기화
    public Employee(String name, double salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    // 급여 인상 메서드
    public void raiseSalary(double percent) {
        salary += salary * percent / 100;
    }

    // 정보 출력 메서드
    public void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("직급: " + position);
        System.out.println("연봉: " + salary);
    }
}

// 관리자 클래스 정의 (직원 클래스 상속)
class Manager extends Employee {
    // 추가 필드: 관리하는 직원 수
    private int numberOfEmployees;

    // 생성자: 이름, 연봉, 직급, 관리하는 직원 수 초기화
    public Manager(String name, double salary, String position, int numberOfEmployees) {
        super(name, salary, position); // 부모 클래스 생성자 호출
        this.numberOfEmployees = numberOfEmployees;
    }

    // 급여 인상 메서드 오버라이딩
    @Override
    public void raiseSalary(double percent) {
        // 관리자는 급여 인상률이 2배로 적용
        super.raiseSalary(percent * 2);
    }

    // 정보 출력 메서드 오버라이딩
    @Override
    public void printInfo() {
        super.printInfo(); // 부모 클래스의 정보 출력
        System.out.println("관리하는 직원 수: " + numberOfEmployees);
    }
}

// Main 클래스에서 실행
public class Exp2 {
    public static void main(String[] args) {
        // 직원 객체 생성
        Employee emp = new Employee("홍길동", 50000000, "대리");
        // 관리자 객체 생성
        Manager mgr = new Manager("김철수", 70000000, "팀장", 5);

        // 직원과 관리자의 정보 출력
        System.out.println("직원 정보:");
        emp.printInfo();

        System.out.println("\n관리자 정보:");
        mgr.printInfo();

        // 급여 인상
        emp.raiseSalary(10);  // 직원은 10% 인상
        mgr.raiseSalary(10);   // 관리자는 10% 인상되지만 2배로 적용

        // 인상 후 정보 출력
        System.out.println("\n급여 인상 후 직원 정보:");
        emp.printInfo();

        System.out.println("\n급여 인상 후 관리자 정보:");
        mgr.printInfo();
    }
}
