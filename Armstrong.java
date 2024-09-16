import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
    
        scanner.close();
        
        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int number) {
        
        String numStr = Integer.toString(number);
        int numDigits = numStr.length();
        
        int sum = 0;
        int temp = number;
        
      
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }
        
      
        return sum == number;
    }
}
