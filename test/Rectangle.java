// package test;

import java.util.Scanner;

public class Rectangle {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int getArea() {
        return length * breadth;
    }

    int getPerimeter() {
        return 2 * (length + breadth);
    }

    boolean areDimensionsSame(Rectangle ob) {
        if (this.length == ob.length && this.breadth == ob.breadth)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, b;

        System.out.println("Enter length & breadth for Rectangle 1:");
        l = sc.nextInt();
        b = sc.nextInt();
        Rectangle ob1 = new Rectangle(l, b);
        System.out.println("Enter length & breadth for Rectangle 2:");
        l = sc.nextInt();
        b = sc.nextInt();
        Rectangle ob2 = new Rectangle(l, b);
        System.out.println("Enter length & breadth for Rectangle 3:");
        l = sc.nextInt();
        b = sc.nextInt();
        Rectangle ob3 = new Rectangle(l, b);

        System.out.println("For Rectangle 1:");
        System.out.println("Length = " + ob1.length);
        System.out.println("Breadth = " + ob1.breadth);
        System.out.println("Area = " + ob1.getArea());
        System.out.println("Perimeter = " + ob1.getPerimeter());
        if (ob1.areDimensionsSame(ob2)) {
            System.out.println("Dimensions of Rectangle 1 & 2 are SAME\n");
        } else {
            System.out.println("Dimensions of Rectangle 1 & 2 are NOT SAME\n");
        }

        System.out.println("For Rectangle 2:");
        System.out.println("Length = " + ob2.length);
        System.out.println("Breadth = " + ob2.breadth);
        System.out.println("Area = " + ob2.getArea());
        System.out.println("Perimeter = " + ob2.getPerimeter());
        if (ob2.areDimensionsSame(ob3)) {
            System.out.println("Dimensions of Rectangle 2 & 3 are SAME\n");
        } else {
            System.out.println("Dimensions of Rectangle 2 & 3 are NOT SAME\n");
        }

        System.out.println("For Rectangle 3:");
        System.out.println("Length = " + ob3.length);
        System.out.println("Breadth = " + ob3.breadth);
        System.out.println("Area = " + ob3.getArea());
        System.out.println("Perimeter = " + ob3.getPerimeter());
        if (ob3.areDimensionsSame(ob1)) {
            System.out.println("Dimensions of Rectangle 3 & 1 are SAME\n");
        } else {
            System.out.println("Dimensions of Rectangle 3 & 1 are NOT SAME\n");
        }

        sc.close();
    }
}
