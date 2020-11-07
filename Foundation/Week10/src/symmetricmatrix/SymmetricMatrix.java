//Create a function named isSymmetric that takes an n×n integer matrix (two dimensional array/list)
//as a parameter and returns true if the matrix is symmetric or false if it is not.

package symmetricmatrix;

public class SymmetricMatrix {

  public boolean isMatrixSymmetric(int[][] matrix) {
    //boolean symmetric = true;
    for (int i = 0; i < matrix.length; i++) {
      int raw[] = matrix[i];

      for (int j = 0; j < raw.length; j++) {
        if (matrix[i][j] != matrix[j][i]) {
          return false;
        }
      }
    }
    return false;
  }
}
