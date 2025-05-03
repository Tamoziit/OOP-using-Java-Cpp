// package assignment.q2;

import java.util.*;

public class q2 {
    public static void main(String args[]) {
        q2 ob = new q2();
        Scanner sc = new Scanner(System.in);
        double temp;
        System.out.println("Enter Room Temperature");

        try {
            temp = sc.nextDouble();

            if (temp < 18.0) {
                throw new Exception("Room temperature is too low");
            } else if (temp > 28.0) {
                throw new Exception("Room temperature is too high");
            } else {
                System.out.println("Valid Room Temperature: " + temp);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a numeric value.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
