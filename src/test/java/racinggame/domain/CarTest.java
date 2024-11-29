package racinggame.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void 차가_앞으로_움직인다() {
		Car car  = new Car("pobi");
		car.move(4);

		assertThat(car.getPosition()).isEqualTo(1);
	}

	@Test
	void 차가_멈춰있는다() {
		Car car  = new Car("pobi");
		car.move(3);

		assertThat(car.getPosition()).isEqualTo(0);

	}

	@Test
	void 최대_이동거리_구하기() {
		int maxPosition = 4;
		Car car = new Car("pobi", 3);

		int actual = car.getMaxPosition(maxPosition);
		assertThat(actual).isEqualTo(4);
	}

	@Test
	void 우승한_자동차() {
		int maxPosition = 3;
		Car car = new Car("pobi", 3);

		assertThat(car.isWinner(maxPosition)).isTrue();
	}

	@Test
	void 우승못한_자동차() {
		int maxPosition = 4;
		Car car = new Car("pobi", 3);

		assertThat(car.isWinner(maxPosition)).isFalse();
	}

}