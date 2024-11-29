package racinggame.domain;

import java.util.List;

import java.util.Map;
import java.util.stream.Collectors;

public class RacingGame {
	private final Cars cars;
	private Round round;

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

	public boolean hasRound() {
		return this.round.isContinue();
	}

	public Map<String, Integer> round() {

		this.cars.round();
		this.round = this.round.decrease();

		return this.cars.getCarState();
	}

	public List<String> findWinners() {
		return this.cars.findWinners();
	}
}
