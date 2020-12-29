/**
 * Chapter 7 Programming Challenge 2: Payroll Class The Payroll class stores
 * information about employee's payroll data using parallel arrays. 
 * 
 * @Author Josh Alcoba
 * 1/28/2016
 */

public class Payroll {
	public final int NUM_EMPLOYEES = 7;
	private int[] employeeId = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489 };
	private int[] hours = new int[NUM_EMPLOYEES];
	private double[] payRate = new double[NUM_EMPLOYEES];
	private double[] wages = new double[NUM_EMPLOYEES];

	public void setEmployeeIdAt(int i, int employeeId) {
		this.employeeId[i] = employeeId;
	}

	public void setHoursAt(int i, int hours) {
		this.hours[i] = hours;
	}

	public void setPayRateAt(int i, double payRate) {
		this.payRate[i] = payRate;
	}

	public void setWagesAt(int i, double wages) {
		this.wages[i] = wages;
	}

	// Getters

	/**
	 * getGrossPay method Returns the gross pay for the employee whose data is
	 * stored at element i of each array.
	 */
	
	public double getGrossPay(int i) {
		return wages[i] = hours[i] * payRate[i];
	}

	public int getEmployeeIdAt(int i) {
		return employeeId[i];
	}

	public int getHoursAt(int i) {
		return hours[i];
	}

	public double getPayRateAt(int i) {
		return payRate[i];
	}

	public double getWagesAt(int i) {
		return wages[i];
	}
}