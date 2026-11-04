import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int numbers[] = {1,1,2,2,3};
        int j=1;
        int i=0;
        while(j<numbers.length){
            if(numbers[j]!=numbers[i]){
                i++;
                numbers[i]=numbers[j];

            }
            j++;
            

        }
        System.out.println(i+1);
        System.out.println(Arrays.toString(numbers));
        
    }
}
