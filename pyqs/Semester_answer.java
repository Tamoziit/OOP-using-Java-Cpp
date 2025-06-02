import java.util.Scanner;

public class Semester_answer {
    int rollNo, qsNo;

    public Semester_answer(int r, int n) {
        this.rollNo = r;
        this.qsNo = n;
    }

    public void calculate_marks() {
        try {
            if (qsNo > 4) {
                throw new Exception("Marks of one question not to be added");
            } else {
                System.out.println("Valid attempt");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        int r, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll No. & no. of questions attempted");
        r = sc.nextInt();
        n = sc.nextInt();

        Semester_answer ob = new Semester_answer(r, n);
        ob.calculate_marks();

        sc.close();
    }
}
