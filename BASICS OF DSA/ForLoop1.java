public class ForLoop1 { 
    
    public static int calculateSum(int low, int high) { 
        if (low > high) { 
            int temp = low; 
            low = high; 
            high = temp; 
        } 
        
        int sum = 0; 
        for (int i = low; i <= high; i++) { 
            sum = sum + i; 
        } 
        return sum; 
    } 

    public static void main(String[] args) {     
        int result = calculateSum(1, 5); 
        System.out.println("The sum is: " + result);
    
        int swappedResult = calculateSum(5, 1); 
        System.out.println("The swapped sum is: " + swappedResult); 
    } 
}
