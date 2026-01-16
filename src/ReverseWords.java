import java.util.Scanner;
public class ReverseWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] words = s.split(" ");
		StringBuilder result = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			result.append(words[i]);
			if (i != 0){
				result.append(" ");
			}
		}
		System.out.print(result.toString());
		sc.close();
	}
}
