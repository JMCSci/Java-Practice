/* Employee class 
 * Practice using private variables
 */

package employee;

public class Employee { 
	private int employeeID;
	private int salary; 
	private int seniority;
 
// no argument constructor -- default employee
	Employee() {
		employeeID = 0;
		salary = 0;
		seniority = 0;
	}
	
// employeeID getter
	public int getEmployeeID() {
		return employeeID;
	}
// salary getter
	public int getSalary() { 
		return salary;
	}
// seniority getter
	public int getSeniority() {
		return seniority;
	}
// employeeID setter
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID; 
	}
// salary setter
	public void setSalary(int salary) {
		this.salary = salary;
	}
// seniority setter
	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}
	
	Employee(int employeeID, int salary, int seniority) { 
		this.employeeID = employeeID;
		this.salary = salary;
		this.seniority = seniority; 
	}


}
