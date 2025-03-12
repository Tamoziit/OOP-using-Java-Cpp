public class Rectangle {
    float length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public float area() {
        return length * breadth;
    }

    public float perimeter() {
        return (2 * (length + breadth));
    }

    public int same(Rectangle r) {
        if (length == r.length && breadth == r.breadth)
            return 1;
        else
            return 0;
    }

    public static void main(String args[]) {
        Rectangle r1 = new Rectangle(5, 6);
        Rectangle r2 = new Rectangle(3, 4);
        Rectangle r3 = new Rectangle(5, 6);

        float area, perimeter;
        int res;

        System.out.println("For Rectangle 1");
        area = r1.area();
        perimeter = r1.perimeter();
        res = r1.same(r2);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
        System.out.println(res == 1 ? "R1 & R2 have same dimensions" : "R1 & R2 DO NOT have same dimensions");

        System.out.println("For Rectangle 2");
        area = r2.area();
        perimeter = r2.perimeter();
        res = r2.same(r3);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
        System.out.println(res == 1 ? "R2 & R3 have same dimensions" : "R2 & R3 DO NOT have same dimensions");

        System.out.println("For Rectangle 1");
        area = r3.area();
        perimeter = r3.perimeter();
        res = r3.same(r1);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
        System.out.println(res == 1 ? "R3 & R1 have same dimensions" : "R3 & R1 DO NOT have same dimensions");
    }
}
