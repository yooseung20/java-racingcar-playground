package racinggame.util;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class NameSplitterTest {

	@Test
	void 문자열을_콤마로_구분한다() {
		List<String> names = NameSplitter.split("pobi,crong,honux");
		assertThat(names).containsExactly("pobi", "crong", "honux");
	}

}