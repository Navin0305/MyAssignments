package week1.day4;

public class Calculator {
	public void addTwoNumbers(int a , int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void subtractTwoNumber(int e , int f) {
		int d=e-f;
		System.out.println(d);
	}
	public void multiplyTwoNumber(double i , double j) {
		double h= i*j;
		System.out.println(h);
	}
	public void divideTwoNumber(float x , float y) {
		float z= x/y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.addTwoNumbers(12,15);
		calc.subtractTwoNumber(29, 20);
		calc.multiplyTwoNumber(2.272,12.727);
		calc.divideTwoNumber(99.3F, 33.1F);
	}

}
