package employee;
import java.util.Scanner;

public class EmployeeUI {
    private Scanner scanner = new Scanner(System.in);
    private EmployeeService service = new EmployeeService();

    public void regist() {
        System.out.println("신규 인사정보를 등록합니다.");
        System.out.println("이름을 입력하세요.");
        String name = scanner.nextLine();

        System.out.println("사번을 입력하세요.");
        String sabun = scanner.nextLine();

        System.out.println("주민번호를 입력하세요.");
        String ssn = scanner.nextLine();

        System.out.println("입력한 정보는 다음과 같습니다.");
        System.out.println(name + " : " + sabun + " : " + ssn);

        Employee emp = new Employee(sabun, name, ssn);
        Boolean addResult = service.add(emp);
        System.out.println("서비스에서 처리된 결과: " + addResult);
    }

    public void print() {
        System.out.println("사원 정보를 검색합니다.");
        System.out.println("이름을 입력하세요.");
        String name = scanner.nextLine();

        Employee emp = service.get(name);
        if(emp != null) {
            System.out.println("=== 검색 결과 ===");
            System.out.println("이름: " + emp.getName());
            System.out.println("사번: " + emp.getSabun());
            System.out.println("주민번호: " + emp.getSsn());
        } else
            System.out.println("해당하는 사원이 없습니다.");
    }

    public static void main(String[] args){
        EmployeeUI ui = new EmployeeUI();
        ui.regist();
        ui.print();
    }
}
