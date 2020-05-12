package employee;
public class Employee {
    private String sabun;
    private String name;
    private String ssn;

    public Employee() {
    }
    public Employee(String sabun, String name) {
        this(sabun, name, "unknown");
    }
    public Employee(String sabun, String name, String ssn) {
        this.sabun = sabun;
        this.name = name;
        this.ssn = ssn;
    }
    public String getSabun() {
        return sabun;
    }
    public String getName() {
        return name;
    }
    public String getSsn() {
        return ssn;
    }
    public void setSabun(String sabun) {
        this.sabun = sabun;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
