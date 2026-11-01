import java.util.*;

public class mulInTwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int ans = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans *= array[i][j];
            }
        }

        System.out.println("The product of the 2D array elements is: " + ans);
    }
}