class AI_DSException extends Exception {
    public AI_DSException(String s) {
        super(s);
    }
}

public class customexception1 {
    public static void main(String[] args) {
        int num = 10, deno = 0;
        try {
            check(num, deno);
        } catch (AI_DSException e) {
            System.out.println(e);
        }
    }

    public static void check(int num, int deno) throws AI_DSException {
        if (deno == 0) {
            throw new AI_DSException("Can't divide a number with zero");
        }
        System.out.println(num / deno);
    }
}
