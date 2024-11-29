package racinggame.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarNameTest {

	@Test
	void 차이름은_5글자를_초과할_수_없다() {
		assertThatThrownBy(() -> new CarName("avante"))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage("자동차 이름은 5자를 초과할 수 없다.");
	}

}