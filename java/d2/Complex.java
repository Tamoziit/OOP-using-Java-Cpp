import java.util.*;

public class Complex {
    float complex, real;

    Complex(float r, float c) {
        this.real = r;
        this.complex = c;
    }

    public void add(Complex a, Complex b) {
        this.real = a.real + b.real;
        this.complex = a.complex + b.complex;
    }

    public void multiply(Complex a, Complex b) {
        this.real = (a.real * b.real) - (a.complex * b.complex);
        this.complex = (a.real * b.complex) + (a.complex * b.real);
    }

    public void display() {
        System.out.println("(" + this.real + ") + (" + this.complex + ")i");
    }

    public static void main(String args[]) {
        Complex num1 = new Complex(3, 2);
        Complex num2 = new Complex(1, 4);

        Complex res1 = new Complex(0, 0);
        res1.add(num1, num2);
        System.out.println("Addition: ");
        res1.display();

        Complex res2 = new Complex(0, 0);
        res2.multiply(num1, num2);
        System.out.println("Multiplication: ");
        res2.display();
    }
}