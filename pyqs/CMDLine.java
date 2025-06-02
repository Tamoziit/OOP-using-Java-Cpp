public class CMDLine {
    public static void main(String[] args) {
        int i, sum = 0;
        for (i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("\nSum = " + sum);
        
    }
}