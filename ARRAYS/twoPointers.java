public class twoPointers {
    public static void main(String[] args) {
        int numbers[] ={1,2,4,6,8,9};
        boolean found = false;
        int target =10;

        int left = 0;
        int right = numbers.length -1 ;

        while(left<right){
            int sum = numbers[left] + numbers[right] ;

            if(sum == target){
                found = true;
                System.out.println("pair found" + ":" + " for target " + target + " the pairs are " + numbers[left]  + " and " + numbers[right]);
                 break;
            }

            else if(sum<target){
                left++ ;
            }
            else if(sum > target){
                right-- ;
            }
    

        }

        if(!found){
            System.out.println("pair not found");
        }
    }
}
