package Model;

public class FulltimeEmployee extends Employee {
    private int bonus;
    private int fines;
    private int hardSalary;

    public FulltimeEmployee() {
    }

    public FulltimeEmployee(int bonus, int fines, int hardSalary) {
        this.bonus = bonus;
        this.fines = fines;
        this.hardSalary = hardSalary;
    }

    public FulltimeEmployee(int employeeCode, String name, int old, int phoneNumber, String email, int bonus, int fines, int hardSalary) {
        super(employeeCode, name, old, phoneNumber, email);
        this.bonus = bonus;
        this.fines = fines;
        this.hardSalary = hardSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFines() {
        return fines;
    }

    public void setFines(int fines) {
        this.fines = fines;
    }

    public int getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(int hardSalary) {
        this.hardSalary = hardSalary;
    }
    @Override
    public String toString() {
        return "demoEmployee.FulltimeEmployee{" +
                "bonus=" + bonus +
                ", fines=" + fines +
                ", hardSalary=" + hardSalary +
                '}' + super.toString();
    }
}
