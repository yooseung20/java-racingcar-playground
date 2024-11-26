package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
	private static final String DELIMITER = ",";

	private List<Car> cars;

	public Cars(String names) {
		this.cars = mappingCar(names);
	}

	public List<String> race() {
		List<String> raceResult = new ArrayList<>();
		for (Car car : this.cars) {
			car.move(NumberGenerator.units());
			raceResult.add(car.print());
		}

		return raceResult;
	}

	public int countCars() {
		return this.cars.size();
	}

	private List<Car> mappingCar(String names) {
		return Arrays.stream(names.split(DELIMITER))
			.map(Car::new)
			.collect(Collectors.toList());
	}

	public List<String> winners() {
		// 가장 큰 위치값 찾기
		int maxPosition = this.cars.stream()
			.mapToInt(Car::getPosition)
			.max()
			.orElse(Integer.MIN_VALUE);

		return this.cars.stream()
			.filter(car -> car.equalsPosition(maxPosition))
			.map(Car::getName)
			.collect(Collectors.toList());
	}
}
