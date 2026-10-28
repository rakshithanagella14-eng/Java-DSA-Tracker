public class minimumFinding {
    public static void main(String[] args) {
        int[] numbers = {6, -2, 11, 4, -7, 9};
        int min=numbers[0];
        int max=numbers[0];
        for(int i=1 ; i<numbers.length ;i++)
        {
            if (max<numbers[i]) {
                max=numbers[i];
                
            }
             if (min>numbers[i]) {
                min=numbers[i];
                
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}