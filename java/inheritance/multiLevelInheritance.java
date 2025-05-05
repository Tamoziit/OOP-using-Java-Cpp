import java.util.*;

class Student {
    String name;
    long rollNo;

    Student(String n, long r) {
        name = n;
        rollNo = r;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + rollNo);
    }
}

class Exam extends Student {
    int marks[];

    Exam(String n, long r, int arr[]) {
        super(n, r);
        marks = new int[4];
        int i;

        for (i = 0; i < 4; i++) {
            marks[i] = arr[i];
        }
    }

    int getSum() {
        int total = 0, i;
        for (i = 0; i < 4; i++) {
            total += marks[i];
        }

        return total;
    }
}

class Result extends Exam {
    char grade;

    Result(String n, long r, int arr[]) {
        super(n, r, arr);
        grade = 'F';
    }

    char getGrade() {
        double percentage = (getSum() / 400.0) * 100.0;

        if (percentage >= 90.0)
            return 'O';
        else if (percentage >= 80.0 && percentage < 90.0)
            return 'A';
        else if (percentage >= 70.0 && percentage < 80.0)
            return 'B';
        else if (percentage >= 60.0 && percentage < 70.0)
            return 'C';
        else if (percentage >= 50.0 && percentage < 60.0)
            return 'D';
        else if (percentage >= 40.0 && percentage < 50.0)
            return 'E';
        else
            return 'F';
    }
}

public class multiLevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        long rollNo;
        int marks[] = new int[4];
        int i;

        System.out.println("Enter name");
        name = sc.nextLine();
        System.out.println("Enter roll no.");
        rollNo = sc.nextLong();
        System.out.println("Enter marks of 4 subjects");
        for (i = 0; i < 4; i++) {
            marks[i] = sc.nextInt();
        }

        Result ob = new Result(name, rollNo, marks);
        ob.displayDetails();
        char grade = ob.getGrade();
        System.out.println("Grade = " + grade);

        sc.close();
    }
}
