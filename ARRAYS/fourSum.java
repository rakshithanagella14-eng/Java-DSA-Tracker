import java.util.Arrays;

public class fourSum {
    public static void main(String[] args) {
        int numbers[] ={-2, 0, 0, 2, 2};
        int target=2;
        Arrays.sort(numbers);

        for(int i=0 ; i<numbers.length-3 ;i++){
                if(i>0 && numbers[i]== numbers[i-1]){
                    continue;
                }
                for(int j=i+1; j<numbers.length-2; j++){
                        if(j>i+1 && numbers[j]== numbers[j-1]){
                        continue;
                    } 
            int left=j+1;
            int right=numbers.length-1;
            int remainingTarget = target-numbers[i] -numbers[j] ;

            while(left<right){
                int sum = numbers[left] + numbers[right];
                    if(sum == remainingTarget){
                        System.out.println(numbers[left] + " ," + numbers[right] +" ," + numbers[i] +" ," + numbers[j]);
                        left++;
                        right--;
                        while(left<right && numbers[left]==numbers[left-1]){
                            left++;
                        }
                        while(left<right && numbers[right]==numbers[right+1]){
                            right--;
                        }
                       }
                    else if(sum< remainingTarget){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
            }
        }
    }
