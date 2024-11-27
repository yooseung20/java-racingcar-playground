package racinggame.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import racinggame.utils.RandomNumber;

class RandomNumberTest {

	@Test
	void _0부터_9까지의_수를_생성한다() {
		int actual = RandomNumber.createUnits();
		assertThat(actual).isBetween(0,9);
	}

}