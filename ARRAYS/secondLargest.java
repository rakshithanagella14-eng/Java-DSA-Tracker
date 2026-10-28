public class secondLargest {
    public static void main(String[] args) {
        int numbers[]={4,9,2,7,9,5};
        int largest;
        int secondlargest;
        if(numbers[0]>numbers[1]){
            largest=numbers[0];
            secondlargest=numbers[1];
        }
    
        else{
            largest=numbers[1];
            secondlargest=numbers[0];
        }

        for(int i =2;i<numbers.length;i++)
        {
            if(numbers[i]>largest){
                secondlargest=largest;
                largest=numbers[i];

            }
           else if(numbers[i]>secondlargest && numbers[i]<largest)
           {
            secondlargest =numbers[i];
           }
        
        
        }
        System.out.println("largest value is " + ":" + largest);
        System.out.println("secondlargest is " + ":" + secondlargest);
    }   




    
}
