import java.util.Scanner;

//WAP IN JAVA TRANSPOSE OF AN MULTIDIMENSIONAL ARRAY
public class matrixprog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the size of matrix ");
        System.out.println("Enter the number of rows : ");
        int row = sc.nextInt();
        System.out.println(" Enter the number of column : ");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(" Enter the element of the matrix : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        int[][] t_matrix = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                t_matrix[j][i] = matrix[i][j];
            }
        }
        System.out.println();
        System.out.println(" original matrix ");
        // original matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print( matrix[i][j]  + " " );
            }
        }
        System.out.println();
        System.out.println(" Transpose of Matrix ");
      // transpose of matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(t_matrix[j][i]+" ");
            }
        }


    }
}