public class celciustofarenheit {
    public static void main(String[] args) {
        celciustofarenheit c = new celciustofarenheit();
        try {
            c.check(-300);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    public double check(double temp) throws IllegalArgumentException {
        if (temp < -273.15) {
            throw new IllegalArgumentException("Invalid temperature");

        }
        return ((temp * (9 / 5)) + 32);
    }
}
