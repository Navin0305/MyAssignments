package week1.day4;

public class RemoveDuplicates {public static void main(String[] args) {

	String text = "We learn java basics as part of java sessions in java week1";

	int count = 0;
	String text2 = "";
	String[] words = text.split(" ");
	for (int i = 0; i < words.length; i++) {
		String words2 = words[i];

		for (int j = 0; j < words.length; j++) {
			if (words2.equals(words[j])) {
				count += 1;
				if (count > 1) {
					words[j] = "";
				}
			}
		}
		if (!words2.equals(" ")) {
			text2 = text2 + words2 + " ";
		}
	}
	System.out.println(text2);
}

}
