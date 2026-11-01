import java.util.*;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");

        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int max = array[0];
        for (int val : array) {
            if (val > max) {
                max = val;
            }
        }

        System.out.println("The maximum element in the array is: " + max);
    }
}