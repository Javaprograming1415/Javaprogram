public class VowelExtractor {
    public static void main(String[] args) {
        
        String input = "Hello, World!";
        
      
        displayVowels(input);
    }

    public static void displayVowels(String input) {
      
        input = input.toLowerCase();
       
      
        String vowels = "aeiou";
        
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
           
            if (vowels.indexOf(ch) != -1) {
                System.out.print(ch + " ");
            }
        }
        
      
        System.out.println();
    }
}
