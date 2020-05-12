package employee;
public class EmployeeDAO {
    private Employee[] arr = new Employee[100];
    private int index = 0;
    public Boolean addNewEmployee(Employee newEmp) {
        Boolean result = false;
        if(index >= arr.length - 1) return false;
        arr[index] = newEmp;
        index++;
        result = true;
        System.out.println("디버그: DAO의 처리결과"+ result);
        return result;
    }
    public Boolean searchEmployee(String name) {
        for(Employee e : arr) {
            if(e.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public Employee getEmployee(String name) {
        for(Employee e : arr) {
            if(e.getName().equals(name)) {
                return e;
            }
        }
        return null;
    }
}