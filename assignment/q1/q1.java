//package assignment.q1;

import java.util.*;

public class q1 {
    int getSum(int arr[], int choice[]) {
        int i;
        int total = 0;

        for (i = 0; i < choice.length; i++) {
            total += arr[choice[i]];
        }

        return total;
    }

    double getSqrtSum(int arr[], int choice[]) {
        int i;
        double total = 0.0, sqrt;

        for (i = 0; i < choice.length; i++) {
            sqrt = Math.sqrt(arr[choice[i]]);
            total += sqrt;
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

    public static void main(String args[]) {
        q1 ob = new q1();
        Scanner sc = new Scanner(System.in);

        int n, i, ch, res1;
        double res2;
        System.out.println("Enter no. of inputs");
        n = sc.nextInt();
        int arr[] = new int[n];
        int choice[] = new int[5];

        System.out.println("Enter Elements");
        for (i = 0; i < n; i++) {
            try {
                ch = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input is not in a valid format. Enter Again!");
                sc.next();
                i--;
                continue;
            }
            arr[i] = ch;
        }

        System.out.println("Choose 5 indices");
        for (i = 0; i < 5; i++) {
            ch = sc.nextInt();
            if (ch < 0 || ch >= arr.length) {
                System.out.println("Invalid Index. Enter Again!");
                i--;
                continue;
            }
            choice[i] = ch;
        }

        System.out.println("Inputs:");
        ob.display(arr);
        System.out.println("Choices:");
        ob.display(choice);

        res1 = ob.getSum(arr, choice);
        res2 = ob.getSqrtSum(arr, choice);

        System.out.println("Sum = " + res1);
        System.out.println("Sqrt Sum = " + res2);

        sc.close();
    }
}