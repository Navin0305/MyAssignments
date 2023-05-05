package week1.day1;

public class Car {

	public static void applyBreak() {
		System.out.println("To Stop the Car");
		}
	public static void applyGear() {
		System.out.println("To Swift the Gears");
		}
	public static void switchonAc() {
		System.out.println("Air Conditioning Inside Portion of the Car");
		}
	public static void applyAccelerate() {
		System.out.println("To Increase the speed");
		}
	public static void main(String[] args) {
		Car audi=new Car();
		audi.applyBreak();
		audi.applyGear();
		audi.switchonAc();
		audi.applyAccelerate();
		
	}

}
