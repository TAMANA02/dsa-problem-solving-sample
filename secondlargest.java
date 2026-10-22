
public class secondlargest {
    public static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 34, 1};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int n = 0; n < arr.length; n++) {
            if (arr[n] > largest) {
                secondLargest = largest;
                largest = arr[n];
            }
            else if (arr[n] > secondLargest && arr[n] != largest) {
                secondLargest = arr[n];
            }
        }

        System.out.println("Largest: " + largest);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second-largest distinct element");
        } else {
            System.out.println("Second largest: " + secondLargest);
        }
    }
}
