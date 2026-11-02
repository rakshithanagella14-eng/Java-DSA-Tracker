import java.util.Arrays;

public class threeSum {
    public static void main(String[] args) {
        int numbers[] = {-1,0,1,2,-1,-4} ;
        Arrays.sort(numbers);

        for(int i=0 ; i<numbers.length -2 ; i++ ){
            if(i>0 && numbers[i] == numbers[i-1]){
                continue;
            }
            
            int target= -numbers[i];
            int left=i+1;
            int right=numbers.length-1;
            
            while(left< right){
                int sum =numbers[left] + numbers[right];
                if(sum == target){
                    System.out.println( numbers[i] + ", " + numbers[left] + ", " + numbers[right]);
                    left++;
                    right--;
                    
                    while(left< right && numbers[left]==numbers[left-1]){
                        left++;
                    }
                    while(left<right && numbers[right]==numbers[right+1]){
                        right--;
                    }
                }

                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
    }
}
