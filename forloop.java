// Step 1: Bring in our input tool
import java.util.Scanner;

public class forloop {

    // Step 2: The Reusable Specialist Tool (Matches Striver's logic)
    public static int forLoop(int low, int high) {
        int sum = 0; // Our piggy bank
        
        for (int i = low; i <= high; i++) {
            sum += i;
        }
        
        return sum; // Hand the folder back to whoever called this method
    }

    // Step 3: The Starting Gun & Manager
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read low and high silently from the test inputs
        int low = sc.nextInt();
        int high = sc.nextInt();
        
        // Call the tool, catch the returned folder, and store it in 'result'
        int result = forLoop(low, high);
        
        // Step 4: The assessment bot expects the output on the screen!
        System.out.print(result); 
        
        sc.close();
    }
}
