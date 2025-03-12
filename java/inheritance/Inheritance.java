class Base {
    int x;

    Base(int a) {
        x = a;
        System.out.println("Base Class Constructor: x = " + x);
    }
}

class Derived extends Base {
    int y;

    Derived(int a, int b) {
        super(a);
        y = b;
        System.out.println("Derived Class Constructor: x = " + x + " y = " + y);
    }
}

public class Inheritance {
    public static void main(String args[]) {
        Derived ob = new Derived(10, 20);
    }
}