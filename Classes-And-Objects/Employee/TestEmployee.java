/* Test Employee class */

package employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee John = new Employee();
		Employee Jane = new Employee(); 
		John.setEmployeeID(1);
		John.setSalary(75000);
		John.setSeniority(5);
		Jane.setEmployeeID(3);
		Jane.setSalary(50000);
		Jane.setSeniority(1);

	}
}
