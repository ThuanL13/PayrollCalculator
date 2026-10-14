import java.util.Arrays;
import java.util.Scanner;     // import the Scanner class
import java.util.*;
public class PayrollCalculator {
    public static void main(String[] args) {
        // Exercise 5
        Scanner read = new Scanner(System.in);

        // Asking for input
        System.out.println("What is your name?: ");
        String name = read.nextLine();

        System.out.println("How many hours did you work?: ");
        double hoursWorked = read.nextDouble();
        read.nextLine();
        System.out.println("What is your pay rate?: ");
        double payRate = read.nextDouble();

        // Calculating gross pay
        double grossPay = hoursWorked * payRate;

        // Printing out results
        System.out.println(name + " has worked " + hoursWorked + "hours" + " and their" +
                " gross pay is: " + grossPay);
        System.out.printf("%s(hours worked: %.2f) $%.2f", name,hoursWorked, grossPay);
        read.nextLine();

        // Bonus
        if (hoursWorked > 40) {
            double overHours = hoursWorked - 40;
            double overtime = 1.5;
            double overpay = overHours * overtime;
            double overGross = grossPay + overpay;
            System.out.println("\nOvertime pay for " + name + " is " + overGross);

        }

        read.close(); // Closing scanner

    }
}
