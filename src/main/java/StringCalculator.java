public class StringCalculator {

	public static int splitAndSum(String input) {
		if (input.isEmpty()) {
			return 0;
		}

		InputSplit inputSplit = new InputSplit(input);
		return add(inputSplit.getNumbers());
	}

	private static int add(String[] numbers) {

		int sum = 0;
		for (String number : numbers) {
			validDigit(number);
			sum += convertInteger(number);
		}
		return sum;
	}

	private static void validDigit(String number) {
		if(number.isEmpty()) {
			throw new RuntimeException("잘못된 입력");
		}

		if (!Character.isDigit(number.charAt(0))) {
			throw new RuntimeException("잘못된 입력");
		}
	}

	private static int convertInteger(String number) {
		return Integer.valueOf(number);
	}
}
