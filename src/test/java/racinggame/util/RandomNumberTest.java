package racinggame.util;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RandomNumberTest {

	@Test
	void createUnits() {
		int actual = RandomNumber.createUnits();
		assertThat(actual).isBetween(0, 9);
	}

}