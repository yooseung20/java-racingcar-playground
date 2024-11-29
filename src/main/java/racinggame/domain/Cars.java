package racinggame.domain;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import racinggame.strategy.MovableStrategy;
import racinggame.util.RandomNumber;

public class Cars {
	private final List<Car> cars;

	public Cars(List<Car> cars) {
		this.cars = cars;
	}

	public Map<String, Integer> getCarState() {
		return this.cars.stream()
			.collect(Collectors.toMap(Car::getName, Car::getPosition));
	}

	public List<String> findWinners() {
		int maxPosition = getMaxPosition();

		return this.cars.stream()
			.filter(car -> car.isWinner(maxPosition))
			.map(Car::getName)
			.collect(Collectors.toList());
	}

	private int getMaxPosition() {

		int maxPosition = Integer.MIN_VALUE;

		for (Car car : this.cars) {
			maxPosition = car.getMaxPosition(maxPosition);
		}

		return maxPosition;
	}

	public void round(MovableStrategy movableStrategy) {
		for (Car car: this.cars) {
			car.move(movableStrategy);
		}
	}
}
