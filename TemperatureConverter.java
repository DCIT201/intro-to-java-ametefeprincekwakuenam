import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Enter 1 or 2: ");
        
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Exiting.");
            return;
        }
        
        int choice = scanner.nextInt();

        if (choice != 1 && choice != 2) {
            System.out.println("Invalid choice. Please restart the program.");
            return;
        }

        System.out.print("Enter the temperature to convert: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid temperature input. Exiting.");
            return;
        }
        double temp = scanner.nextDouble();
        double converted = (choice == 1) ? (temp * 9 / 5) + 32 : (temp - 32) * 5 / 9;

        System.out.printf("Converted Temperature: %.2f%n", converted);
        System.out.println("Thank you for using the Temperature Converter!");
    }
}