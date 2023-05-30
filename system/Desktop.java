package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("23 inches");
	}
	public static void main(String[] args) {
		Desktop details=new Desktop();
		details.desktopSize();
		details.computerModel();//Parent Class
	}

}
