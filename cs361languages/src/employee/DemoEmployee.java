/**
 * 
 */
package employee;

/**
 * @author Michael Dadi
 *
 */

// Resource: https://www.baeldung.com/java-type-casting

// Complete the provided code

public class DemoEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee emp1 = new Employee("John", "Smith", "123456790");

		PartTimeEmployee pEmp1 = new PartTimeEmployee("Jane", "Smith", "123456777", 17.5);

//		Employee emp2 = new Employee("Don", "Holmes", "123456799");

//		PartTimeEmployee pEmp2 = new PartTimeEmployee("Melissa", "Will", "123456666", 23.5);

		// Upcasting
		Employee emp3 = pEmp1;
		System.out.println("emp3");
		emp3.whoAmI();

		// emp3.whoAmI() // prints "PART TIME EMPLOYEE" because it is set equal to pEmp1, which is a PartTimeEmployee object
		// emp3.getHourlyRate(); // returns syntax error because it does not inherit the getHourlyRate function of the type PartTimeEmployee, as it was initialized as an Employee object


		// Add the condition that test that emp3 is an instance of part time employee at
		// this time
		 if (emp3 instanceof PartTimeEmployee) {
		 	System.out.println("emp3 instance of part time employee"); // printed
		 } else {
			System.out.println("emp3 not instance of part time employee");
		 }

		// Downcasting 1

		 PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1;

		// This instruction compiles
		// This instruction returns a ClassCastException at run time
		// because a variable of type Employee cannot be cast to PartTimeEmployee

		// Downcasting 2
		// Requires the use of intanceof to avoid a run time cast exception

		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
			PartTimeEmployee pEmp4 = (PartTimeEmployee) emp3; // cast required
			System.out.println(pEmp4.getHourlyRate());
		} else {
			System.out.println("emp3 not instance of part time employee");
		}
	}
}
