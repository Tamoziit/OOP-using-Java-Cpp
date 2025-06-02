import java.util.*;

interface Department {
    void display();
}

class TestDepartment implements Department {
    String depName = "CSE";

    public void display() {
        depName = "CSE(AIML)";
        System.out.println("Department name is " + depName);
    }

    public static void main(String args[]) {
        Department ref = new TestDepartment();
        ref.display();
    }
}
