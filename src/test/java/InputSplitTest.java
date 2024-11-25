import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class InputSplitTest {

	@Test
	void 디폴트_구분자_찾기() {
		String input = "2,3";
		InputSplit inputSplit = new InputSplit(input);
		String expected = ",|;";
		assertThat(inputSplit.getDelimiter()).isEqualTo(expected);
	}

	@Test
	void 커스텀_구분자_찾기() {
		String input = "//;\n1;2;3";
		InputSplit inputSplit = new InputSplit(input);
		String expected = ";";
		assertThat(inputSplit.getDelimiter()).isEqualTo(expected);
	}

	@Test
	void 기본구분자로_분리했을때_숫자개수() {
		String input = "2,3";
		InputSplit inputSplit = new InputSplit(input);
		int expected = 2;
		assertThat(inputSplit.numberSize()).isEqualTo(expected);
	}

	@Test
	void 커스텀구분자로_분리했을때_숫자개수() {
		String input = "//;\n1;2;3";
		InputSplit inputSplit = new InputSplit(input);
		int expected = 3;
		assertThat(inputSplit.numberSize()).isEqualTo(expected);
	}

	@Test
	void 입력문자열_시작값_검증() {
		String input = "안녕";
		assertThrows(RuntimeException.class, () -> new InputSplit(input));
	}

}
