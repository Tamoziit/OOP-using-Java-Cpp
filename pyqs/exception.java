public class exception {
    public void catchException() {
        try {
            int arr[] = { 1, 2, 3 };
            System.out.println(arr[3]); // ArrayIndexOutOfBoundsException

            int a = 50 / 0; // ArithmeticException

            String s = null;
            System.out.println(s.length()); // NullPointerException
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println(e1.getMessage());
        } catch (ArithmeticException e2) {
            System.out.println(e2.getMessage());
        } catch (NullPointerException e3) {
            System.out.println(e3.getMessage());
        }
    }

    public static void main(String[] args) {
        exception ob = new exception();
        ob.catchException();
    }
}
