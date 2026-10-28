public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {5, 5, 5};

        int largest = numbers[0];
        int secondLargest = 0;
        boolean found = false;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
                found = true;
            } else if (numbers[i] < largest) {
                if (!found || numbers[i] > secondLargest) {
                    secondLargest = numbers[i];
                    found = true;
                }
            }
        }

        System.out.println("Largest: " + largest);

        if (found) {
            System.out.println("Second largest: " + secondLargest);
        } else {
            System.out.println("No second-largest distinct value exists.");
        }
    }
}