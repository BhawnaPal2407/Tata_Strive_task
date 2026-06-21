import java.util.Scanner;
// WAP to create 3D Array
public class matrixprog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Creating 3D Array");
        System.out.println("Enter a number of row : ");
        int row = sc.nextInt();
        System.out.println("Enter a number of column : ");
        int col = sc.nextInt();
        System.out.println("Enter a depth of array : ");
        int depth = sc.nextInt();

        int[][][] arr = new int[row][col][depth];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < depth; k++) {
                    System.out.println("Enter a element of array : ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println();
        System.out.println(" 3D Array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < depth; k++) {
                    System.out.print(arr[i][j][k]+",");
                }
            }
        }


    }
}
