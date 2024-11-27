package racinggame.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import racinggame.utils.NameDelimiter;

class NameDelimiterTest {

	@Test
	void 자동차_이름은_콤마로_구분한다() {
		String names = "pobi,crong,honux";
		String[] actual = NameDelimiter.split(names);

		assertThat(actual[0]).isEqualTo("pobi");
		assertThat(actual[1]).isEqualTo("crong");
		assertThat(actual[2]).isEqualTo("honux");
	}

}