


public class PatternDisplay {
    public static void main(String[] args) {
        int n = 5;
        
  
        for (int i = 0; i < n; i++) {
          
            for (int j = n - i; j <= n; j++) {
                System.out.print(j + " ");
            }
          
            System.out.println();
        }
    }
}
