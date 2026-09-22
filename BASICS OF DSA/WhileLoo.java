import java.util.Scanner;

public class WhileLoo{

    // 1. The Reusable Specialist Tool (Clean & Optimized)
    public static int whileLoo(int d) {
        // Handle the special case: if d is 0, the first positive integer (> 0) is 10
        int currentNum;
        if (d == 0) {
            currentNum = 10;
        } else {
            currentNum = d;
        }
        
        int sum = 0;
        int count = 0; // Your clean count-up clicker starting at 0
        
        // Loop runs exactly 50 times using the high-speed +10 jumping pattern
        while (count < 50) {
            sum += currentNum;   // Drop the valid match into the piggy bank
            currentNum += 10;    // Jump directly to the next matching number
            count++;             // Click our counter up by 1
        }
        
        return sum; // Hand the final accumulated value back to main
    }

    // 2. The Starting Gun (Mandatory for Blank Canvas Exams)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the target digit 'd' silently from the platform's terminal
        int d = sc.nextInt();
        
        // Run the tool, catch the returned sum, and store it in 'result'
        int result = whileLoo(d);
        
        // Print the final result directly to the screen for the automated grading bot
        System.out.print(result);
        
        sc.close();
    }
}