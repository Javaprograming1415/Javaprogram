import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequencyCounter {

    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        
        scanner.close();

        
        Map<Character, Integer> frequencyMap = countCharacterFrequency(input);

      
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    
    public static Map<Character, Integer> countCharacterFrequency(String str) {
        
        Map<Character, Integer> freqMap = new HashMap<>();

        
        char[] characters = str.toCharArray();

        
        for (char ch : characters) {
            
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        
        return freqMap;
    }
}
