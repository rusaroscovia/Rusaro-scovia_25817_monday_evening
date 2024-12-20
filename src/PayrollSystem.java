import java.util.Scanner;

interface Payroll {
    double calculatePermanent(double salary);
    double calculateCasual(double salary);
    double calculateContractual(double salary);
}

class PermanentEmployee implements Payroll {
    @Override
    public double calculatePermanent(double salary) {
        double deductions = (salary * 0.02) + (salary * 0.05) + (salary * 0.026);
        return salary - deductions;
    }

    @Override
    public double calculateCasual(double salary) {
        return 0;
    }

    @Override
    public double calculateContractual(double salary) {
        return 0; // Not applicable
    }
}

class CasualEmployee implements Payroll {
    @Override
    public double calculatePermanent(double salary) {
        return 0;
    }

    @Override
    public double calculateCasual(double salary) {
        double deductions = (salary * 0.02) + (salary * 0.026);
        return salary - deductions;
    }

    @Override
    public double calculateContractual(double salary) {
        return 0;
    }
}

class ContractualEmployee implements Payroll {
    @Override
    public double calculatePermanent(double salary) {
        return 0;
    }

    @Override
    public double calculateCasual(double salary) {
        return 0;
    }

    @Override
    public double calculateContractual(double salary) {
        double deductions = (salary * 0.02) + (salary * 0.026);
        return salary - deductions;
    }
}

public class PayrollSystem {

    public static boolean validateEmployeeDetails(int age, int experience) {
        return age >= 20 && age <= 65 && experience >= 5;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID (number): ");
        int id = scanner.nextInt();

        System.out.print("Enter First Name: ");
        String firstName = scanner.next();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.next();

        System.out.print("Enter Age (20-65): ");
        int age = scanner.nextInt();

        System.out.print("Enter Years of Experience (minimum 5): ");
        int experience = scanner.nextInt();

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter Employee Type (1-Permanent, 2-Casual, 3-Contractual): ");
        int type = scanner.nextInt();

        if (!validateEmployeeDetails(age, experience)) {
            System.out.println("Invalid inputs. Please try again.");
            return;
        }

        Payroll employee;
        double finalSalary = 0;

        switch (type) {
            case 1:
                employee = new PermanentEmployee();
                finalSalary = employee.calculatePermanent(salary);
                break;
            case 2:
                employee = new CasualEmployee();
                finalSalary = employee.calculateCasual(salary);
                break;
            case 3:
                employee = new ContractualEmployee();
                finalSalary = employee.calculateContractual(salary);
                break;
            default:
                System.out.println("Invalid employee type.");
                return;
        }
        System.out.println("\n----------------------------");
        System.out.println("Employee Details");
        System.out.println("----------------------------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Salary Before Deductions: " + salary);
        System.out.println("Final Salary After Deductions: " + finalSalary);
        System.out.println("----------------------------");
    }
}
