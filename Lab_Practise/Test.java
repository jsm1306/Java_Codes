public class Test {
    public static void main(String args[]) {
        char ch = 'E';
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {


            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is a Vowel");
            } else System.out.println(ch + " is a Consonant");
        } else System.out.println(ch + " is an Invalid input, not in range of alphabets");
    }
}
