package employee_jdbc;
public class EmployeeService {
    private EmployeeDAO dao = new EmployeeDAO();

    public boolean add(Employee emp) {
        System.out.println("신규 인사정보를 추가하는 기능 테스트");
        System.out.println(emp.getName());
        System.out.println(emp.getSabun());
        System.out.println(emp.getSsn());
        emp.setSabun("Korea:" + emp.getSabun());
        System.out.println("디버그: 서비스 객체에서 DAO객체에게 처리를 위임");
        Boolean daoResult = dao.addNewEmployee(emp);
        return daoResult;
    }

    public Employee get(String name) {
        System.out.println("사원 정보를 검색하는 기능 테스트");
        Boolean ok = dao.searchEmployee(name);
        Employee emp = null;
        if(ok) {
            emp = dao.getEmployee(name);
        }
        return emp;
    }
}
