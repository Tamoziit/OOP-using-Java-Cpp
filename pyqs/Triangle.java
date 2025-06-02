public class Triangle {
    double a, b, c;

    public Triangle(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    public double calcArea() {
        double area = 0.0;
        try {
            if (a + b > c && b + c > a && c + a > b) {
                double s = (a + b + c) / 2;
                area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            } else {
                throw new Exception("TriangleException");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return area;
    }

    public static void main(String[] args) {
        Triangle ob = new Triangle(1, 0, 0);
        double res = ob.calcArea();
        System.out.println("Res = " + res);
    }
}
