import java.util.Scanner;

public class AlternateCharacterPrinter {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        
        scanner.close();
        
        
        displayAlternateCharacters(input);
    }

    public static void displayAlternateCharacters(String input) {
      
        for (int i = 0; i < input.length(); i += 2) {
            System.out.print(input.charAt(i));
        }
        
      
        System.out.println();
    }
}
