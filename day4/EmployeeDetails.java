package week1.day4;

public class EmployeeDetails {
	
	public void getEmployeeName(String name) {
		System.out.println("Name:"+name);
	}
	public void getEmployeeId(int a) {
		System.out.println("EmployeeID:"+a);
	}
	public void employeeAddress(String address) {
		System.out.println("Address:"+address);
	}
	public void employeeSalary(double a) {
		System.out.println("Salary:"+a);
	}
	public void employeePhnNumber(long a) {
		System.out.println("MobileNumber:"+a);
	}
	public static void main(String[] args) {
		EmployeeDetails details=new EmployeeDetails();
		details.getEmployeeName("Navin S");
		details.getEmployeeId(112106021);
		details.employeeAddress("Chennai");
		details.employeeSalary(35000.999);
		details.employeePhnNumber(8838071780L);
		
		
	}

	

}
