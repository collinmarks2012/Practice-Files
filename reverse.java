import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		System.out.println("Enter word to reverse: \n");
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		char[] wordword = word.toCharArray();
		char[] revWord = new char[word.length()];
		for (int i = 1; i <= word.length(); i++){
			revWord[i-1] = wordword[word.length() - i];
		}
		System.out.println(revWord);
	}

}
