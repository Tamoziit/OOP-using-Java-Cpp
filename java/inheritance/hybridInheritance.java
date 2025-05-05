import java.util.*;

class Student {
    String name;
    long rollNo;

    Student(String n, long r) {
        name = n;
        rollNo = r;
    }

    void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + rollNo);
    }
}

class Exam extends Student {
    int marks[] = new int[5];

    Exam(String n, long r, int arr[]) {
        super(n, r);
        int i;
        for (i = 0; i < 5; i++) {
            marks[i] = arr[i];
        }
    }

    int getSum() {
        int total = 0, i;
        for (i = 0; i < 5; i++) {
            total += marks[i];
        }

        return total;
    }
}

interface MARPoints {
    int totalPoints = 120;
}

class Result extends Exam implements MARPoints {
    Result(String n, long r, int arr[]) {
        super(n, r, arr);
    }

    void getResult() {
        int total = getSum();
        System.out.println("Total marks = " + total);
        System.out.println("Total MAR points = " + totalPoints);

        if (totalPoints < 100) {
            System.out.println("Fail");
            return;
        }
        if (total < 40) {
            System.out.println("Fail");
            return;
        } else {
            System.out.println("Pass");
            return;
        }
    }
}

public class hybridInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        long rollNo;
        int marks[] = new int[5];
        int i;

        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter roll no.:");
        rollNo = sc.nextLong();
        System.out.println("Enter marks of 5 subjects");
        for (i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        Result ob = new Result(name, rollNo, marks);
        ob.getDetails();
        ob.getResult();

        sc.close();
    }
}
