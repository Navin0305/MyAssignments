package week2.day1;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		int[] arr={14,12,11,15,14,18,16,17,19,18,17,20};
		int len=arr.length;
		System.out.println("The Length of Array is="+ len);
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
					
				}
				
			}
		
	}

	}
}
