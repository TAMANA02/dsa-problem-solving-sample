public class Diagonalsum {
   static public void main(String[] args) {
      int[][] input_matrix = {
         { 4,5,1},
         { 1,2,3},
         { 4,6,1},

      };
      int matrix_size = 3;
      System.out.println("The matrix is defined as : ");
      for (int i = 0; i < matrix_size; i++) {
         for (int j = 0; j < matrix_size; j++)
         System.out.print( input_matrix[i][j] + " ");
         System.out.print("\n");
      }
      int principal_diagonal = 0, secondary_diagonal = 0;
      for (int i = 0; i < matrix_size; i++) {
         for (int j = 0; j < matrix_size; j++) {
            if (i == j)
               principal_diagonal += input_matrix[i][j];
            if ((i + j) == (matrix_size - 1))
               secondary_diagonal += input_matrix[i][j];
         }
      }
      System.out.println("\n The sum of principal diagonal elements of the matrix is: " + principal_diagonal);
      System.out.println("\n The sum of secondary diagonal elements of the matrix is: " + secondary_diagonal);
   }
}