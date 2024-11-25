package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberGeneratorTest {

	@Test
	void _1부터_9까지의수_생성() {
		int units = NumberGenerator.units();
		assertThat(units).isBetween(1,9);
	}
}