import java.util.Scanner;

public class calc {
	static double calculate(double firstNumber, String operator, double secondNumber) {
		switch (operator) {
			case "+":
			case "add":
				return firstNumber + secondNumber;
			case "-":
			case "subtract":
				return firstNumber - secondNumber;
			case "*":
			case "multiply":
				return firstNumber * secondNumber;
			case "/":
			case "divide":
				if (secondNumber == 0) {
					throw new IllegalArgumentException("cannot divide by zero");
				}
				return firstNumber / secondNumber;
			default:
				throw new IllegalArgumentException("operator must be +, -, *, or /");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("First number: ");
			double firstNumber = scanner.nextDouble();
			scanner.nextLine();

			System.out.print("Operator (+, -, *, /): ");
			String operator = scanner.nextLine().trim().toLowerCase();

			System.out.print("Second number: ");
			double secondNumber = scanner.nextDouble();

			double result = calculate(firstNumber, operator, secondNumber);
			System.out.println("Result: " + result);
		} catch (java.util.InputMismatchException error) {
			System.out.println("Error: numbers must be valid numeric values");
		} catch (IllegalArgumentException error) {
			System.out.println("Error: " + error.getMessage());
		} finally {
			scanner.close();
		}
	}
}
