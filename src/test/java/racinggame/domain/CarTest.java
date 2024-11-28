package racinggame.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void 차가_앞으로_움직인다() {
		Car car  = new Car("pobi");
		car.move(4);

		assertThat(car.getPosition()).isEqualTo(new Position(1));
	}

	@Test
	void 차가_멈춰있는다() {
		Car car  = new Car("pobi");
		car.move(3);

		assertThat(car.getPosition()).isEqualTo(new Position(0));

	}

}