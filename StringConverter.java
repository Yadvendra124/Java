import java.util.Scanner;

public class StringConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            char lowerCh = Character.toLowerCase(ch);
            if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                result.append('#');
            } else if (Character.isLetter(ch)) {
                result.append('$');
            } else {
                result.append(ch);
            }
        }

        
        System.out.println("Converted string: " + result.toString());
    }
}
