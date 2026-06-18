// Practice 15: Employee Payroll
//PRANISH KHANAL
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

abstract class Employee {       //abstract class
    protected String name;

    public Employee(String name) {  //normal method
        this.name = name;
    }

    public abstract double calculatePay();      //abstract method

    public String getPayrollLine() {
        return name + ": Rs. " + String.format("%.2f", calculatePay());
    }
}

class FullTime extends Employee {       //Fultime employee class
    private double monthlySalary;

    public FullTime(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {  //overriding method
        return monthlySalary;
    }
}

class Contractor extends Employee { //instance variable and Contractor class
    private double hourlyRate;
    private int hoursWorked;

    public Contractor(String name, double hourlyRate, int hoursWorked) {        //constructor
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {          //overriding
        return hourlyRate * hoursWorked;
    }
}

public class Emp_Payroll {
    public static void main(String[] args) {

        Employee[] staff = {
                new FullTime("Maya", 60000),
                new Contractor("Ram", 900, 45),
                new FullTime("Sita", 75000),
                new Contractor("Hari", 1200, 30)
        };

        String fileName = "payroll_report.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Employee employee : staff) {
                String line = employee.getPayrollLine();
                writer.write(line);
                writer.newLine();
                System.out.println(line);
            }

            System.out.println("Payroll exported to " + fileName);

        } catch (IOException e) {
            System.out.println("Error writing payroll report: " + e.getMessage());
        }
    }
}