import java.util.*;

public class Matrix {
    int rows, cols;
    int[][] data;

    Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    public void inputMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of the Matrix");
        int i, j;
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                data[i][j] = sc.nextInt();
            }
        }
    }

    public void displayMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public Matrix multiply(Matrix A, Matrix B) {
        if (A.cols != B.rows) {
            System.out.println("Multiplication not possible! Columns of A must match rows of B.");
            return null;
        }

        Matrix res = new Matrix(A.rows, B.cols);
        int i, j, k;
        for (i = 0; i < A.rows; i++) {
            for (j = 0; j < B.cols; j++) {
                for (k = 0; k < A.cols; k++) {
                    res.data[i][j] += A.data[i][k] * B.data[k][j];
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns of first matrix: ");
        int rowsA = sc.nextInt();
        int colsA = sc.nextInt();

        System.out.print("Enter rows and columns of second matrix: ");
        int rowsB = sc.nextInt();
        int colsB = sc.nextInt();

        Matrix A = new Matrix(rowsA, colsA);
        Matrix B = new Matrix(rowsB, colsB);

        A.inputMatrix();
        B.inputMatrix();

        System.out.println("Matrix A:");
        A.displayMatrix();
        System.out.println("Matrix B:");
        B.displayMatrix();

        Matrix res = new Matrix(0, 0);
        res = res.multiply(A, B);

        if (res != null) {
            System.out.println("Resultant Matrix:");
            res.displayMatrix();
        }

        sc.close();
    }
}