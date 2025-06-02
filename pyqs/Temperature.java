import java.util.Scanner;

public class Temperature {
    public void checkTemp(int temp) {
        try {
            if (temp > 40) {
                throw new Exception("TooHot");
            } else if (temp < 20) {
                throw new Exception("TooCold");
            } else {
                System.out.println("Optimal Temp.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Temperature ob = new Temperature();
        Scanner sc = new Scanner(System.in);
        int temp;

        System.out.println("Enter temp");
        temp = sc.nextInt();
        ob.checkTemp(temp);

        sc.close();
    }
}
