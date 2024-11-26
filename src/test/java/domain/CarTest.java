package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class CarTest {

	@Test
	void 각각의_자동차는_이름을_가질_수_있다() {
		String name = "pobi";
		Car car = new Car(name);
		String expected = "pobi";

		assertThat(car.getName()).isEqualTo(expected);
	}

	@Test
	void 자동차_이름은_5글자를_넘어서는_안됩니다() {
		String name = "sonata";

		assertThatThrownBy(() -> new Car(name))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("자동차 이름은 5자를 초과할 수 없습니다");
	}

	@Test
	void 자동차의_처음_위치는_0입니다() {
		String name = "pride";
		Car car = new Car(name);

		assertThat(car.getPosition()).isEqualTo(0);
	}

	@Test
	void 자동차는_4이상의_가속도가_주어질때_앞으로_움직입니다() {
		String name = "pride";
		Car car = new Car(name);
		car.move(4);

		assertThat(car.getPosition()).isEqualTo(1);
	}

	@Test
	void 자동차는_4이하의_가속도가_주어질때_제자리를_유지합니다() {
		String name = "pride";
		Car car = new Car(name);
		car.move(3);

		assertThat(car.getPosition()).isEqualTo(0);
	}

	@Test
	void 자동차는_자신의_이름과_위치정보를_출력할수있다() {
		String name = "pobi";
		Car car = new Car(name);
		car.move(5);

		String result = car.print();
		assertThat(result).contains("pobi : -");
	}
}
