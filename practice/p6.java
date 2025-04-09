//package practice;

public class p6 {
    double getArea(int r) {
        return (22.0 / 7.0) * r * r;
    }

    double getArea(int l, int b) {
        return l * b;
    }

    public static void main(String[] args) {
        p6 ob = new p6();
        System.out.println("Area of Circle  = " + ob.getArea(7));
        System.out.println("Area of Rectangle  = " + ob.getArea(3, 4));
    }
}
