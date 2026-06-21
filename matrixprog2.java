import java.util.Scanner;

// CREATE A MULTIDIMENSIONAL ARRAY BUT THE SIZE OF AN ARRAY BY THE USER   SUM ALL THE ELEMENT OF AN ARRAY
public class matrixprog2 {
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

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += matrix[i][j];
            }
            System.out.println();
        }
        System.out.println(" Sum of all element is : "+sum);
    }
}
