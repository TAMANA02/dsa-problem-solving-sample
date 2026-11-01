import java.util.*;

public class Mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");

        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int ans = 1;
        for (int val : array) {
            ans *= val;
        }

        System.out.println("The product of the array elements is: " + ans);
    }
}