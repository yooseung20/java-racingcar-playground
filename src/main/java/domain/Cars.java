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
		List<String> winners = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		for (Car car : this.cars) {
			if (car.isWin(max)) {
				winners.add(car.getName());
			}
		}
		return winners;
	}
}
