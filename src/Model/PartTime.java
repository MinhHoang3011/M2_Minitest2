package Model;

public class PartTime extends Employee{
    private int workingHours;

    public PartTime() {

    }

    public PartTime(int workingHours) {
        this.workingHours = workingHours;
    }

    public PartTime(int employeeCode, String name, int old, int phoneNumber, String email, int workingHours) {
        super(employeeCode, name, old, phoneNumber, email);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "Employee.PartTime{" +
                "workingHours=" + workingHours +
                '}' + super.toString();
    }
}
