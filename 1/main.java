import java.util.Date;

public class main {
    public static void main(String[] args) {
        Date dob = new Date(1990, 7, 1);
        Employee employee = new Employee("John Smith", dob, 50000);
        
        SalaryCalculator calculator = new SalaryCalculator();
        int netSalary = calculator.calculateNetSalary(employee);
        
        String empInfo = employee.getEmpInfo();
        String name = employee.getName();
        Date empDob = employee.getDob();
        int baseSalary = employee.getBaseSalary();
        
        System.out.println("Employee: " + empInfo);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}
