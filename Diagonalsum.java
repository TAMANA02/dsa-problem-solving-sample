public class Diagonalsum {
   static public void main(String[] args) {
      int[][] input_array = {
         { 4,5,1},
         { 1,2,3},
         { 4,6,1},

      };
      int array_size = 3;
     
      int principal_diagonal = 0, secondary_diagonal = 0;
      
      for (int i = 0; i < array_size; i++) {
         for (int j = 0; j < array_size; j++) {
            if (i == j)
               principal_diagonal += input_array[i][j];
            if ((i + j) == (array_size - 1))
               secondary_diagonal += input_array[i][j];
         }
      }
      System.out.print("\n The sum of principal diagonal elements of the array is: " + principal_diagonal);
      System.out.print("\n The sum of secondary diagonal elements of the array is: " + secondary_diagonal);
   }
}
