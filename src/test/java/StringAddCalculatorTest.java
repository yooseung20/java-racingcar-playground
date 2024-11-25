import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringAddCalculatorTest {

	@Test
	void 기본구분자_사용() {
		String input = "1,2,3";
		int actual = StringCalculator.splitAndSum(input);
		int expected = 6;
		assertThat(actual).isEqualTo(expected);
	}

	@Test
	void 비어진_문자열() {
		String input = "";
		int actual = StringCalculator.splitAndSum(input);
		int expected = 0;
		assertThat(actual).isEqualTo(expected);
	}

	@Test
	void 숫자하나() {
		String input = "1";
		int actual = StringCalculator.splitAndSum(input);
		int expected = 1;
		assertThat(actual).isEqualTo(expected);
	}

	@Test
	void 콜론구분자() {
		String input = "1;2";
		int actual = StringCalculator.splitAndSum(input);
		int expected = 3;
		assertThat(actual).isEqualTo(expected);
	}

	@Test
	void 커스텀구분자() {
		String input = "//#\n1#2#3";
		int actual = StringCalculator.splitAndSum(input);
		int expected = 6;
		assertThat(actual).isEqualTo(expected);
	}

	@Test
	void 마이너스() {
		String input = "//;\n1;-1";
		assertThrows(RuntimeException.class, () -> StringCalculator.splitAndSum(input));

	}
	@Test
	void 숫자가_입력되지_않는경우() {
		String input = "//#\n";
		assertThrows(RuntimeException.class, () -> StringCalculator.splitAndSum(input));

	}

	@Test
	void 설정한_구분자가_아닌_다른값인_경우() {
		String input = "//#\n1;2;3";
		assertThrows(RuntimeException.class, () -> StringCalculator.splitAndSum(input));

	}

}
