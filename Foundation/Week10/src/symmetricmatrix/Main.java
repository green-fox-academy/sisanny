package symmetricmatrix;

public class Main {
  public static void main(String[] args) {
    SymmetricMatrix sm = new SymmetricMatrix();

    int[][] array1 = {
            {1, 0, 1},
            {0, 2, 2},
            {1, 2, 5},
    };


    int[][] array2 = {
            {7, 7, 7},
            {6, 5, 7},
            {1, 2, 1},
    };

    System.out.println(sm.isMatrixSymmetric(array1));
    System.out.println(sm.isMatrixSymmetric(array2));
  }
}