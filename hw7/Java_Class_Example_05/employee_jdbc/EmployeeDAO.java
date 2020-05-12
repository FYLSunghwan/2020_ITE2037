package employee_jdbc;
import java.sql.*;

public class EmployeeDAO {
    private Employee[] arr = new Employee[100];
    private int index = 0;

    String url = "jdbc:odbc:singer_group";
    String user = "java";
    String psw = "java";

    public EmployeeDAO() {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        }catch(java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }
    }
    public Boolean addNewEmployee(Employee newEmp) {
        Connection con;
        PreparedStatement pstmt;
        try {
            con = DriverManager.getConnection(url,user,psw);
            pstmt = con.prepareStatement("create table emp_table(sabun varchar(10),name varchar(20), ssn varchar(13))");
            pstmt.executeUpdate();

            pstmt = con.prepareStatement("insert into emp_table values(?,?,?)");
            pstmt.setString(1, newEmp.getSabun());
            pstmt.setString(2, newEmp.getName());
            pstmt.setString(3, newEmp.getSsn());
            pstmt.executeUpdate();

            pstmt.close();
            con.close();
        }catch(SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
        return true;
    }

    public Boolean searchEmployee(String name) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Employee emp = null;
        Boolean ok = false;

        try {
            con = DriverManager.getConnection(url, user, psw);
            pstmt = con.prepareStatement("select name from emp_table where name=?");
            pstmt.setString(1, name);

            rs = pstmt.executeQuery();
            if(rs.next()) ok=true;
        }catch(SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                pstmt.close();
                con.close();
            }catch(SQLException e) {
                e.printStackTrace();
            }
        }
        return ok;
    }

    public Employee getEmployee(String name) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Employee emp = null;
        try {
            con = DriverManager.getConnection(url, user, psw);
            pstmt = con.prepareStatement("select * from emp_table where name=?");
            pstmt.setString(1, name);

            rs = pstmt.executeQuery();
            if(rs.next()) {
                emp = new Employee();
                emp.setName(rs.getString("name"));
                emp.setSabun(rs.getString("sabun"));
                emp.setSsn(rs.getString("ssn"));
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                pstmt.close();
                con.close();
            }catch(SQLException e) {
                e.printStackTrace();
            }
        }
        return emp;
    }
}