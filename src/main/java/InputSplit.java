
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputSplit {
	private final static String BASIC_DELIMITER = ",|;";
	private final static String CUSTOM_PATTERN = "//(.)\n(.*)";
	private String delimiter;
	private String[] numbers;

	public InputSplit(String input) {
		validStartWith(input);
		mapping(input);
	}

	public String getDelimiter() {
		return this.delimiter;
	}

	private void mapping(String input) {
		if (customStartWith(input)) {
			mappingCustom(input);
			return; // 커스텀 구분자 처리
		}
		mappingBasic(input); // 기본 구분자 처리

	}

	private void mappingCustom(String input) {
		Matcher matcher = Pattern.compile(CUSTOM_PATTERN).matcher(input);
		if (matcher.find()) {
			this.delimiter = matcher.group(1); // 커스텀 구분자
			this.numbers = matcher.group(2).split(this.delimiter); // 실제 숫자 부분 // 실제 숫자 부분
		}

	}

	private void mappingBasic(String input) {
		this.delimiter = BASIC_DELIMITER;
		this.numbers = input.split(BASIC_DELIMITER);
	}

	public int numberSize() {
		return this.numbers.length;
	}

	private void validStartWith(String input) {
		if (!(customStartWith(input) || basicStartWith(input))) {
			throw new RuntimeException("잘못된 입력 형식입니다.");
		}
	}

	private boolean customStartWith(String input) {
		return input.startsWith("//");
	}

	private boolean basicStartWith(String input) {
		return Character.isDigit(input.charAt(0));
	}

	public String[] getNumbers() {
		return this.numbers;
	}
}
