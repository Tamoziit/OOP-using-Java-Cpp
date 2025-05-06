// package test;

public class Complex {
    int real, imaginary;

    Complex(int r, int i) {
        this.real = r;
        this.imaginary = i;
    }

    void getSum(Complex a, Complex b) {
        this.real = a.real + b.real;
        this.imaginary = a.imaginary + b.imaginary;
    }

    void getMultiplication(Complex a, Complex b) {
        this.real = (a.real * b.real) - (a.imaginary * b.imaginary);
        this.imaginary = (a.imaginary * b.real) + (a.real * b.imaginary);
    }

    void display() {
        System.out.println("(" + this.real + ") + (" + this.imaginary + ")i");
    }

    public static void main(String[] args) {
        Complex num1 = new Complex(1, 2);
        Complex num2 = new Complex(3, -2);
        Complex res1 = new Complex(0, 0);
        Complex res2 = new Complex(0, 0);

        System.out.print("Num 1 = ");
        num1.display();
        System.out.print("Num 2 = ");
        num2.display();

        res1.getSum(num1, num2);
        res2.getMultiplication(num1, num2);

        System.out.print("Addition = ");
        res1.display();
        System.out.print("Multiplication = ");
        res2.display();
    }
}
