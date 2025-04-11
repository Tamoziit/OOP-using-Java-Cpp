public class p13 {
    static void m(int a) {
        System.out.println("int");
    }

    static void m(long a) {
        System.out.println("long");
    }

    static void m(Integer a) {
        System.out.println("Integer");
    }

    public static void main(String[] args) {
        m((short) 5);
        m('a');

        String s1 = "Java";
        char[] a1 = { 'J', 'a', 'v', 'a', '\0' };
        String s2 = new String(a1);
        String s3 = new String(s1);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        //System.out.println(s2 + " " + s3);
    }
}
