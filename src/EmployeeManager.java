import Model.Employee;
import Model.FulltimeEmployee;
import Model.PartTime;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new FulltimeEmployee(01, "hoang", 24, 0123, "hahaha@gmail.com", 100, 10, 100000);
        employee[1] = new FulltimeEmployee(02, "hoang1", 25, 0163, "hihaha@gmail.com", 200, 10, 200000);
        employee[2] = new FulltimeEmployee(03, "hoang2", 26, 0143, "hohaha@gmail.com", 300, 10, 300000);

        employee[3] = new PartTime(04, "hoàng4", 27, 0189, "Hehoho@gmail.com", 30);
        employee[4] = new PartTime(05, "hoàng5", 28, 01889, "Hihoho@gmail.com", 40);
        checkMoneyReceivedFullTime(employee)

        checkMoneyReceivedPassTime(employee);

        thanAverage(employee);

        System.out.println(sumMoneyReceivedPassTime(employee));

        System.out.println(sortFullTime(employee));
    }

    public static void checkMoneyReceivedFullTime(Employee employee[]) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] instanceof FulltimeEmployee) {
                double bonus1 = ((FulltimeEmployee) employee[i]).getBonus();
                double hardSalary1 = ((FulltimeEmployee) employee[i]).getHardSalary();
                double fines1 = ((FulltimeEmployee) employee[i]).getFines();
                System.out.println(hardSalary1 + (bonus1 - fines1));
            }
        }
    }

    public static void checkMoneyReceivedPassTime(Employee employee[]) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] instanceof PartTime) {
                double workingHours1 = ((PartTime) employee[i]).getWorkingHours();
                System.out.println(workingHours1 * 100000);
            }
        }
        public static double getAverage (Employee employee[]){
            double sumHardSalary = 0;
            for (int i = 0; i < employee.length; i++) {
                if (employee[i] instanceof FulltimeEmployee) {
                    double hardSalary1 = ((FulltimeEmployee) employee[i]).getHardSalary();
                    sumHardSalary += hardSalary1;
                }
            }
            return sumHardSalary / 4;
        }
        public static void thanAverage (Employee employee[]){
            for (int i = 0; i < employee.length; i++) {
                if (employee[i] instanceof FulltimeEmployee) {
                    if (((FulltimeEmployee) employee[i]).getHardSalary() < getAverage(employee)) {
                        System.out.println(((FulltimeEmployee)employee[i]).toString());
                    }
                }
            }
        }

        public static double sumMoneyReceivedPassTime (Employee employee[]){
            double sumMoneyReceived = 0;
            for (int i = 0; i < employee.length; i++) {
                if (employee[i] instanceof PartTime) {
                    double workingHours1 = ((PartTime) employee[i]).getWorkingHours();
                    sumMoneyReceived += workingHours1 * 100000;
                }
            }
            return sumMoneyReceived;
        }

        public static Employee[] sortFullTime (Employee employee[]){
            double temp = ((FulltimeEmployee) employee[0]).getHardSalary();
            for (int i = 0; i < employee.length - 1; i++) {
                if (employee[i] instanceof FulltimeEmployee) {
                    if (((FulltimeEmployee) employee[i]).getHardSalary() < getAverage(employee)) {
                        for (int j = i + 1; j < employee.length; j++) {
                            if (((FulltimeEmployee) employee[i]).getHardSalary() < ((FulltimeEmployee) employee[j]).getHardSalary()) {
                                temp = ((FulltimeEmployee) employee[j]).getHardSalary();

                            }
                        }
                    }
                }
            }
            return employee;
        }
    }
}