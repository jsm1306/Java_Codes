public class nullpointerex {
    static String str = null;

    public static void main(String[] args) {
        try {
            check(str);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    public static void check(String str) throws NullPointerException {
        if (nullpointerex.str == null) {
            throw new NullPointerException("The string is null");
        }
        System.out.println(nullpointerex.str);
    }
}
