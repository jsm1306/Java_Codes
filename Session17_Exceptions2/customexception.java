class AIDSException extends Exception {
    public AIDSException(String s) {
        super(s);
    }
}

public class customexception {
    public static void main(String[] args) {
        try {
            System.out.println("Starting the try block...");
            int i = 10;
            int j = 2;
            int result = i / j;
            System.out.println("The result of " + i + "/" + j + " is: " + result);
            throw new AIDSException("This is my custom exception");
        } catch (AIDSException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}
