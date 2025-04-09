class Department {
    Department() {
        System.out.println("CSE");
    }

    Department(String name) {
        this();
        System.out.println("CSE: String Constructor" + name);
    }
}

public class p12 extends Department {
    p12() {
        System.out.println("Third year ");
    }

    p12(String name) {
        this();
        System.out.println("Third year: String Constructor" + name);
    }

    public static void main(String[] args) {
        new p12("Section A+B+C");
    }
}