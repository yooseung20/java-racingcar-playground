package racinggame.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PositionTest {

	@Test
	void move() {
		Position position = new Position(1);
		assertThat(position.move()).isEqualTo(new Position(2));
	}

}