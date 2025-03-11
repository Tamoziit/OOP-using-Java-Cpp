/* Alternate Approach without using 'this' keyword */
import java.util.*;

public class Complex2 {
    float complex, real;

    Complex2(float r, float c) {
        real = r;
        complex = c;
    }

    Complex2 add(Complex2 a) {
        float r1 = real + a.real;
        float c1 = complex + a.complex;
        Complex2 c = new Complex2(r1, c1);
        return c;
    }

    Complex2 multiply(Complex2 a) {
        float r1 = (real * a.real) - (complex * a.complex);
        float c1 = (real * a.complex) + (complex + a.real);
        Complex2 c = new Complex2(r1, c1);
        return c;
    }

    public void display() {
        System.out.println("(" + real + ") + (" + complex + ")i");
    }

    public static void main(String args[]) {
        Complex2 num1 = new Complex2(10, 20);
        Complex2 num2 = new Complex2(5, 9);
        Complex2 res1 = new Complex2(0, 0);
        Complex2 res2 = new Complex2(0, 0);

        System.out.println("First No.: ");
        num1.display();
        System.out.println("Second No.: ");
        num2.display();

        res1 = num1.add(num2);
        res2 = num1.multiply(num2);

        System.out.println("Addition: ");
        res1.display();
        System.out.println("Multiplication: ");
        res2.display();
    }
}
