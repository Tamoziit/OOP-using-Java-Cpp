import java.util.*;

public class Exception1 {
    int getSum(int arr[], int choice[]) {
        int i, total = 0;
        for (i = 0; i < choice.length; i++) {
            total += arr[choice[i]];
        }

        return total;
    }

    double getSqrtSum(int arr[], int choice[]) {
        int i;
        double total = 0.0;
        for (i = 0; i < choice.length; i++) {
            total += Math.sqrt(arr[choice[i]]);
        }

        return total;
    }

    void display(int arr[]) {
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exception1 ob = new Exception1();
        int i, n, ch;

        System.out.println("Enter size");
        n = sc.nextInt();
        int arr[] = new int[n];
        int choice[] = new int[5];

        System.out.println("Enter elements:");
        for (i = 0; i < n;) {
            try {
                ch = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Enter again");
                sc.next();
                continue;
            }
            arr[i++] = ch;
        }

        System.out.println("Enter 5 indices:");
        for (i = 0; i < 5;) {
            try {
                ch = sc.nextInt();
                if (ch < 0 || ch >= n) {
                    throw new Exception("Invalid Index");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Enter again");
                sc.next();
                continue;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                // sc.next();
                continue;
            }

            choice[i++] = ch;
        }

        System.out.print("Arr = ");
        ob.display(arr);
        System.out.print("Choice = ");
        ob.display(choice);

        int res1;
        double res2;
        res1 = ob.getSum(arr, choice);
        res2 = ob.getSqrtSum(arr, choice);

        System.out.println("Sum = " + res1);
        System.out.println("Sqrt Sum = " + res2);

        sc.close();
    }
}
