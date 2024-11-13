public class throwex3 {
    public static void main(String[] args) {
        String text = null;

        try {
            printText(text);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void printText(String text) {
        if (text == null) {
            throw new NullPointerException("Text cannot be null");
        }
        System.out.println("Text: " + text);
    }
}
