package racinggame.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PositionTest {

	@Test
	void create() {
		Position position = new Position(1);
		assertThat(position).isEqualTo(new Position(1));
	}

	@Test
	void increase() {
		Position position = new Position(1);
		position.increase();
		assertThat(position).isEqualTo(new Position(2));
	}

	@Test
	void valid() {
		assertThatThrownBy(() -> new Position(-1))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage("위차값은 양수만 가능하다.");
	}
}
