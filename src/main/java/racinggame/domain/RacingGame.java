package racinggame.domain;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RacingGame {
	private final Cars cars;
	private final Round round;
	public  RacingGame(List<String> cars, int round) {
		this.cars = mappingCars(cars);
		this.round = new Round(round);
	}

	private Cars mappingCars(List<String> carNames) {
		List<Car> cars = carNames.stream()
			.map(Car::new)
			.collect(Collectors.toList());
		return new Cars(cars);
	}

}
