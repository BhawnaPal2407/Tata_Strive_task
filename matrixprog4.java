import java.util.Scanner;

// Write program to ADD and multiply 2 matrix
public class matrixprog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// create a first matrix
        System.out.println("Create your first Matrix");
        System.out.println("Enter the number of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter the number of column : ");
        int col = sc.nextInt();

        int[][] matrix1 = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the element :");
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        // Creating 2nd Matrix
        System.out.println(" Now creating 2nd Matrix");

        int[][] matrix2 = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the element : ");
                matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("First Matrix :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix1[i][j]+" ");
            }
        }
        System.out.println();
        System.out.println("Second Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix2[i][j]+" ");
            }
        }

        System.out.println();
        int[][] sum = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = matrix1[i][j]+matrix2[i][j];
            }
        }
       //sum of 2 matrix
        System.out.println();
        System.out.println(" Sum of Two Matrix ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(sum[i][j]+" ");
            }
        }
        // multiplication
        int[][] mul = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mul[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        System.out.println(" Multiplication of two matrix ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(mul[i][j]+" ");
            }
        }
    }
}
