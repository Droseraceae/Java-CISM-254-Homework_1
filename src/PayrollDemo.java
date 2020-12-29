import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Chapter 7 Programming Challenge 2: Payroll Class This program demonstrates
 * the Payroll class. Josh Alcoba 1/28/2016
 */

public class PayrollDemo {
	public static void main(String[] args) {
		int hours;
		double payRate;
		Scanner keyboard = new Scanner(System.in);
		Payroll pr = new Payroll();

		for (int i = 0; i < pr.NUM_EMPLOYEES; i++) {
			
			System.out.print("Enter the hours worked by employee number " + pr.getEmployeeIdAt(i) + ": ");
			hours = keyboard.nextInt();
			while (hours < 0) {
				System.out.print("ERROR: Enter 0 or greater for hours: ");
				hours = keyboard.nextInt();
			}
			
			System.out.print("Enter the hourly pay rate for employee number " + pr.getEmployeeIdAt(i) + ": ");
			payRate = keyboard.nextDouble();
			while (payRate < 6.00) {
				System.out.println("ERROR: Enter 6.00 or greater for pay rate: ");
				payRate = keyboard.nextDouble();
			}

			pr.setHoursAt(i, hours);
			pr.setPayRateAt(i, payRate);
		}

		DecimalFormat dollar = new DecimalFormat("#,##0.00");

		System.out.println("\nPAYROLL DATA");
		System.out.println("Josh Alcoba, 1/28/2016");
		System.out.println("============");
		for (int i = 0; i < pr.NUM_EMPLOYEES; i++) {
			System.out.println("Employee ID: " + pr.getEmployeeIdAt(i));
			System.out.println("Gross pay: $" + dollar.format(pr.getGrossPay(i)) + "\n");
		}
		keyboard.close();
		System.exit(0);
	}
}