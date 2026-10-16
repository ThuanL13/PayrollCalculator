import java.util.Scanner;
public class RefactoredPayrollCalculator {
    // Calculating regular pay
    public static double calculateGrossPay(double hoursWorked, double payRate) {
        return hoursWorked * payRate; // Returns gross pay; hours worked * pay rate
    }
    // Checking for overtime
    public static boolean hasOvertime(double hoursWorked) {
        return hoursWorked > 40; // Returns if hours worked > 40
    }
    // Calculating overtime if true
    public static double calculateOverTimePay(double hoursWorked) {
        double overtimeHours = hoursWorked - 40; // Checking how many hours of overtime
        return overtimeHours * 1.5; // * overtime hours by overtime rate
    }
    // Showing pay information
    public static void displayPayroll(String name, double hoursWorked, double grossPay) {
        System.out.println(name + " worked " + hoursWorked + " hours and their gross pay is: $" + grossPay);
        System.out.printf("%s, (Hours worked: %.2f) $%.2f%n", name, hoursWorked, grossPay);
    }
    // Calling all methods above
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // Asking for user inputs
        System.out.println("What is your name?: ");
        String name = read.nextLine(); // Reads next line entered
        System.out.println("How many hours did you work?: ");
        double hoursWorked = read.nextDouble(); // Reads next double entered
        System.out.println("What is your pay rate?: ");
        double payRate = read.nextDouble(); // Reads next double entered

        // Calculating gross pay
        double grossPay = calculateGrossPay(hoursWorked, payRate);

        // Displaying results
        displayPayroll(name, hoursWorked, grossPay);

        // Calling for overtime check
        if (hasOvertime(hoursWorked)) {
            double overTimePay = calculateOverTimePay(hoursWorked);
            double totalPay = grossPay + overTimePay; // Calculating gross + overtime for total
            System.out.printf("Overtime pay for %s is: $%.2f%n", name, totalPay);
        }
    read.close(); // Closing the scanner read
    }

}
