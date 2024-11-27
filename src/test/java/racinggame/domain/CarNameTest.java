package racinggame.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarNameTest {

	@Test
	void 자동차의_이름은_5자를_초과할수없다() {
		assertThatThrownBy(() -> new CarName("avante"))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("자동차 이름은 5자를 초과할 수 없다");
	}

	@Test
	void 자동차의_이름은_비어있을_수_없다() {
		assertThatThrownBy(() -> new CarName(""))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage("자동차 이름은 비어있을 수 없다.");
	}

}