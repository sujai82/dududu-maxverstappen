def calculate(first_number, operator, second_number):
	"""Return the result of applying an arithmetic operator."""
	if operator in ("+", "add"):
		return first_number + second_number
	if operator in ("-", "subtract"):
		return first_number - second_number
	if operator in ("*", "multiply"):
		return first_number * second_number
	if operator in ("/", "divide"):
		if second_number == 0:
			raise ValueError("cannot divide by zero")
		return first_number / second_number
	raise ValueError("operator must be +, -, *, or /")


def main():
	try:
		first_number = float(input("First number: "))
		operator = input("Operator (+, -, *, /): ").strip().lower()
		second_number = float(input("Second number: "))
		result = calculate(first_number, operator, second_number)
	except ValueError as error:
		print(f"Error: {error}")
		return

	print(f"Result: {result:g}")


if __name__ == "__main__":
	main()
