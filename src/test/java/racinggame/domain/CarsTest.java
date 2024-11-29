package racinggame.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class CarsTest {
	@Test
	void 현재_자동차들의_상태를_알수있다() {
		Car pobi = new Car("pobi", 1);
		Car crong = new Car("crong", 2);
		Car honux = new Car("honux", 3);

		Cars cars = new Cars(Arrays.asList(pobi, crong, honux));
		Map<String, Integer> carState = cars.getCarState();
		assertThat(carState.keySet()).contains("pobi", "crong", "honux");
		assertThat(carState.get("pobi")).isEqualTo(1);
	}

	@Test
	void 경주가_끝난뒤_우승자들을_알수있다() {
		Car pobi = new Car("pobi", 1);
		Car crong = new Car("crong", 3);
		Car honux = new Car("honux", 3);

		Cars cars = new Cars(Arrays.asList(pobi, crong, honux));
		List<String> winners = cars.findWinners();
		assertThat(winners).containsExactly("crong", "honux");
	}


}