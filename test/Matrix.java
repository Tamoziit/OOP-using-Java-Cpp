
// package test;
import java.util.Scanner;

public class Matrix {
    int rows, cols;
    int data[][];

    Matrix(int r, int c) {
        this.rows = r;
        this.cols = c;
        this.data = new int[this.rows][this.cols];
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        int i, j;
        for (i = 0; i < this.rows; i++) {
            for (j = 0; j < this.cols; j++) {
                this.data[i][j] = sc.nextInt();
            }
        }
    }

    public void display() {
        int i, j;
        for (i = 0; i < this.rows; i++) {
            for (j = 0; j < this.cols; j++) {
                System.out.print(this.data[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    public Matrix multiply(Matrix A, Matrix B) {
        if (A.cols != B.rows) {
            System.out.println("Multiplication NOT POSSIBLE!");
            return null;
        }

        Matrix res = new Matrix(A.rows, B.cols);
        int i, j, k;

        for (i = 0; i < A.rows; i++) {
            for (j = 0; j < B.cols; j++) {
                for (k = 0; k < A.cols; k++) {
                    res.data[i][j] += A.data[i][k] + B.data[k][j];
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Matrix A = new Matrix(3, 2);
        Matrix B = new Matrix(2, 3);

        System.out.println("Enter elements of Matrix 1:");
        A.input();
        System.out.println("Enter elements of Matrix 2:");
        B.input();

        System.out.println("Matrix 1:");
        A.display();
        System.out.println("Matrix 2:");
        B.display();

        Matrix res = new Matrix(0, 0);
        res = res.multiply(A, B);

        if (res != null) {
            System.out.println("Resultant:");
            res.display();
        }
    }
}
