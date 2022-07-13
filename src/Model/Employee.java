package Model;

public class Employee {
private int employeeCode;
private String name;
private int old;
private int phoneNumber;
private String email;

    public Employee() {
    }

    public Employee(int employeeCode, String name, int old, int phoneNumber, String email) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.old = old;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Employee.java{" +
                "employeeCode=" + employeeCode +
                ", name='" + name + '\'' +
                ", old=" + old +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
