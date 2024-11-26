package domain;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CarsTest {
	@Test
	void 한바퀴를_돌고나면_자동차의_이름과_위치정보가_출력된다() {
		String names = "pobi,crong,honux";
		Cars cars = new Cars(names);
		List<String> result = cars.race();

		assertThat(result.get(0)).contains("pobi : -");
		assertThat(result.get(1)).contains("crong : -");
		assertThat(result.get(2)).contains("honux : -");
	}

	@Test
	void 자동차_이름은_쉼표를_기준으로_구분한다() {
		String names = "pobi,crong,honux";
		Cars cars = new Cars(names);
		assertThat(cars.countCars()).isEqualTo(3);
	}

	@Test
	void 우승자는_한명_이상이다() {
		String names = "pobi,crong,honux";
		Cars cars = new Cars(names);
		List<String> winners = cars.winners();
		assertThat(winners.size()).isGreaterThanOrEqualTo(1);
	}
}
