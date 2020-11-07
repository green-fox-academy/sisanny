// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

public class Matrix {
    public static void main(String[] args) {
        char[][] matrix = new char[8][8];
        for (int i = 0; i < matrix.length; i++) {

            char[] row = matrix[i];
            for (int j = 0; i < row.length; j++) {
                if ((i + j) % 2 == 0) {
                    row[j] = '0';
                } else {
                    row[j] = '1';
                }
            }
        }
        for (char[] row : matrix) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
