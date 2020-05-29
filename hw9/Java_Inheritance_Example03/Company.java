class Employee {
    protected String name;
    protected String idnum;
    protected String title;
    protected int    salary;

    public Employee(String name, String idnum) {
        this.name = name;
        this.idnum = idnum;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void work() {
        System.out.println("\tEmployee \"" + name + "\" does his best.");
    }
}

class Manager extends Employee {
    private String dept;
    
    public Manager(String name, String idnum, String dept) {
        super(name, idnum);
        this.dept = dept;
    }

    public void work() {
        System.out.println("Manager \""+name+"\"works hard with his subordinates in "+dept +" dept.");
    }
}

public class Company {
    private Employee[] employees;
    public Company() {
        employees = new Employee[4];
        employees[0] = new Manager("Choi Jong Myung", "F99847", "Finance");
        employees[1] = new Manager("Kim Young Chul", "F99832", "Developer");
        employees[2] = new Employee("park", "F99792");
        employees[3] = new Employee("lee", "F94732");
    }

    public void makeMoney() {
        for(int i=0;i<employees.length;i++) {
            employees[i].work();
        }
    }

    public static void main(String args[]) {
        Company mycom = new Company();
        mycom.makeMoney();
    }
}