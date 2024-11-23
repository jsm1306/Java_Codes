class UnderAge extends Exception {
    public UnderAge(String s) {
        super(s);
    }
}

public class UserSignupEx {
    public static void main(String[] args) {
        UserSignupEx user = new UserSignupEx();
        try {
            user.register(19);
        } catch (UnderAge e) {
            System.out.println(e);
        }
    }

    public void register(int age) throws UnderAge {
        if (age < 18) {
            throw new UnderAge("You are under 18 years");
        }
        System.out.println("You can register, follow next steps");
    }
}
