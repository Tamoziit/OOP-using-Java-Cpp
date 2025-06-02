import mycomplex.Helper;

public class Complex {
    public static void main(String[] args) {
        Helper ob1 = new Helper(5, 3);
        Helper ob2 = new Helper(-3, -3);
        Helper res = new Helper(0, 0);

        ob1.show();
        ob2.show();

        res = ob1.add(ob2);
        res.show();
        res = ob1.sub(ob2);
        res.show();
        res = ob1.mul(ob2);
        res.show();

        /* Not part of qs. just my experiment */
        ob1 = null;
        ob2 = null;
        res = null;
        System.gc();
    }

    /* Not part of qs. just my experiment */
    @Override
    protected void finalize() {
        System.out.println("Garbage collection");
    }
}
