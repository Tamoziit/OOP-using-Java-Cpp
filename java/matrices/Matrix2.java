import java.util.Scanner;

public class Matrix2 {
    public void input(int[][] mat, int rows, int cols) {
        Scanner sc = new Scanner(System.in);
        int i, j;

        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    public void display(int[][] mat, int rows, int cols) {
        int i, j;

        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void multiply(int[][] mat1, int[][] mat2, int[][] res, int r1, int c2, int c1) {
        int i, j, k;
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                for (k = 0; k < c1; k++) {
                    res[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
    }

    public static void main(String[] args) {
        Matrix2 ob = new Matrix2();
        Scanner sc = new Scanner(System.in);
        int r1, c1, r2, c2;
        System.out.println("Enter the dimensions of Matrix 1:");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.println("Enter the dimensions of Matrix 2:");
        r2 = sc.nextInt();
        c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Multiplication Not Possible!");
            System.exit(0);
        }

        int[][] mat1 = new int[r1][c1];
        int[][] mat2 = new int[r2][c2];

        System.out.println("Enter the elements of Matrix 1:");
        ob.input(mat1, r1, c1);
        System.out.println("Enter the elements of Matrix 2:");
        ob.input(mat2, r2, c2);

        System.out.println("Matrix 1:");
        ob.display(mat1, r1, c1);
        System.out.println("Matrix 2:");
        ob.display(mat2, r2, c2);

        int[][] res = new int[r1][c2];
        ob.multiply(mat1, mat2, res, r1, c2, c1);
        System.out.println("After Multiplication, Resultant:");
        ob.display(res, r1, c2);

        sc.close();
    }
}
