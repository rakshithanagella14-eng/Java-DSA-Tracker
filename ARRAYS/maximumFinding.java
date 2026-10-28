public class maximumFinding {
    public static void main(String[] args) {
        int[] numbers = {7, 7, 3, 7};;
        int max=numbers[0];
        for(int i=1 ; i<numbers.length ;i++)
        {
            if (max<numbers[i]) {
                max=numbers[i];
                
            }
        }
        System.out.println(max);
    }
}
