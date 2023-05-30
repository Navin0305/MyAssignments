package day2;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("2000 has deposited in your account");
	}
	public static void main(String[] args) {
		AxisBank info=new AxisBank();
		info.deposit();
		
	}

}
