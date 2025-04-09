
//package practice;
import java.util.*;

public class p10 {
    void sort(int[] args) {
        int i, j, temp;
        for (i = 0; i < args.length - 1; i++) {
            for (j = 0; j < args.length - i - 1; j++) {
                if (args[j] > args[j + 1]) {
                    temp = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = temp;
                }
            }
        }
    }

    void display(int[] args) {
        int i;
        for (i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        p10 ob = new p10();
        int i;
        int[] arr = new int[5];
        for (i = 0; i < 5; i++) {
            arr[i] = Integer.valueOf(args[i]);
        }

        ob.display(arr);
        ob.sort(arr);
        System.out.println("Sorted args:");
        ob.display(arr);
    }
}
