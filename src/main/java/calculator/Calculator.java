package calculator;

public class Calculator {

	public double calculate(String expression) {
		checkValidate(expression);
		String[] expressions = parseExpression(expression);

		int firstNumberIdx = 0;
		int firstOperatorIdx = 1;
		int lastOperatorIdx = expressions.length - 1;
		int nextNumberIdxInterval = 2;

		double answer = Integer.parseInt(expressions[firstNumberIdx]);
		for (int i = firstOperatorIdx; i < lastOperatorIdx; i += nextNumberIdxInterval) {
			int operatorIdx = i + 1;
			answer = calculate(expressions[i], answer, Integer.parseInt(expressions[operatorIdx]));
		}
		return answer;
	}

	private String[] parseExpression(String expression) {
		String[] expressions = expression.split(" ");
		if (expressions.length < 3) {
			throwValidation(expression);
		}
		return expressions;
	}

	private void checkValidate(String expression) {
		if (expression == null || expression.isEmpty()) {
			throwValidation(expression);
		}
	}

	private void throwValidation(String expression) {
		throw new IllegalArgumentException(
				String.format("validation check failed, (expression = %s)", expression));
	}

	private double plus(double left, int right) {
		return left + right;
	}

	private double calculate(String operation, double left, int right) {
		switch (operation) {
			case "+":
				return plus(left, right);
			case "-":
				return minus(left, right);
			case "*":
				return mul(left, right);
			case "/":
				return division(left, right);
			default:
				throw new IllegalArgumentException(
						String.format("check operation failed, (operation = %s)", operation));
		}
	}

	private double minus(double left, int right) {
		return left - right;
	}

	private double mul(double left, int right) {
		return left * right;
	}

	private double division(double left, int right) {
		return left / right;
	}

}