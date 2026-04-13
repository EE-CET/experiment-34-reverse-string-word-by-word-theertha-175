import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextLine()) return;

        String input = sc.nextLine().trim();

        if (input.isEmpty()) return;

        // Split by one or more spaces
        String[] words = input.split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }

        System.out.print(sb.toString());
    }
}
