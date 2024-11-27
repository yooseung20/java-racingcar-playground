package racinggame.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void 자동차는_이름을_가지고있다() {
		Car car = new Car("pobi");
		CarName carName = new CarName("pobi");
		assertThat(car.getCarName()).isEqualTo(carName);
	}

	@Test
	void 자동차는_위치값을_가지고있다() {
		Car car = new Car("pobi");
		Position position = new Position(0);
		assertThat(car.getPosition()).isEqualTo(position);
	}

	@Test
	void 자동차는_4이상값을_가지면_움직인다() {
		Car car = new Car("pobi");
		int acceleration = 4;
		car.move(acceleration);

		Position expected = new Position(1);
		assertThat(car.getPosition()).isEqualTo(expected);

	}

	@Test
	void 자동차는_4미만값을_가지면_움직이지_않는다() {
		Car car = new Car("pobi");
		int acceleration = 3;
		car.move(acceleration);

		Position expected = new Position(0);

		assertThat(car.getPosition()).isEqualTo(expected);

	}

}