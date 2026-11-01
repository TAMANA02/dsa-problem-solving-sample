import java.util.*;

public class Min{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");

        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int min = array[0];
        for (int val : array) {
            if (val < min) {
                min = val;
            }
        }

        System.out.println("The minimum element in the array is: " + min);
    }
}