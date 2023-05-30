package day2;

public class BankInfo {
	public void saving() {
		System.out.println("You having 1200 in savings Account");
	}
	public void fixed() {
		System.out.println("Your fixed amount has been credited");
	}
	public void deposit() {
		System.out.println("5000 has deposited in your Account");
	}
	public static void main(String[] args) {
		BankInfo details=new BankInfo();
		details.saving();
		details.fixed();
		details.deposit();
	}

}
