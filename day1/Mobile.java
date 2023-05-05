package week1.day1;

public class Mobile {

	public static void sendMessage() {
		System.out.println("To Text");
		}
	public static void shareDocuments() {
		System.out.println("To Share the Documents");
		}
	public static void call() {
		System.out.println("To Voice Call");
		}
	public static void main(String[] args) {
		Mobile redmi=new Mobile();
		redmi.sendMessage();
		redmi.shareDocuments();
		redmi.call();
	}

}
