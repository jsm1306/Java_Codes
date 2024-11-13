public class tempconv {
    public static void main(String[] args) {
        tempconv converter = new tempconv();
        try {
            double fahrenheit = converter.celsiusToFahrenheit(-300);
            System.out.println("Fahrenheit: " + fahrenheit);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public double celsiusToFahrenheit(double celsius) throws IllegalArgumentException {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Temperature cannot be below absolute zero.");
        }
        return (celsius * 9 / 5.0) + 32;
    }
}
