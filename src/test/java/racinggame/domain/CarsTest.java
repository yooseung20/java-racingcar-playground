package racinggame.domain;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class CarsTest {

	@Test
	void findWinners() {
		Car pobi = new Car("pobi",3);
		Car crong = new Car("crong",3);
		Car honux = new Car("honux",2);
		Cars cars = new Cars(List.of(pobi, crong, honux));
		assertThat(cars.findWinners()).containsExactly("pobi", "crong");
	}

	@Test
	void lap() {
		Car pobi = new Car("pobi");
		Car crong = new Car("crong");
		Car honux = new Car("honux");
		Cars cars = new Cars(List.of(pobi, crong, honux));

		List<Car> actual = cars.lap();
		assertThat(actual.get(0)).isEqualTo(pobi);
		assertThat(actual.get(1)).isEqualTo(crong);
		assertThat(actual.get(2)).isEqualTo(honux);
	}

}