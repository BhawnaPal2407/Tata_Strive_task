import java.util.Scanner;

// WAP to convert matrix into identity matrix and diagonal
public class matrixprog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row : ");
        int row = sc.nextInt();
        System.out.println("Enter a coloum :");
        int col = sc.nextInt();

        int[][]  matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j]= sc.nextInt();
            }

        }
        System.out.println("\noriginal matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        // diagonal matrix
        System.out.println("\ndiagonal matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j)
                    System.out.println(matrix[i][j]+ " ");
                else
                    System.out.print(" 0 ");
            }
            System.out.println();
        }
        // identity matrix
        if (row == col){
            System.out.print(" identity matrix");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (i == j)
                        System.out.print(" 1 ");
                    else
                        System.out.print(" 0 ");
                }
                System.out.println();

            }

        }else{
            System.out.println(" identity matrix is for square matrix");
        }


    }

}
