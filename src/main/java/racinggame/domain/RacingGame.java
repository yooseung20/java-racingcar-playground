package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

import racinggame.ResultView;
import racinggame.utils.NameDelimiter;

public class RacingGame {

	private Cars cars;

	private int lapCount;

	public RacingGame(String cars, int lapCount) {
		this.cars = mappingCars(cars);
		this.lapCount = lapCount;
	}

	private Cars mappingCars(String names) {
		List<Car> carList = new ArrayList<>();

		for (String name : NameDelimiter.split(names)) {
			carList.add(new Car(name));
		}

		return new Cars(carList);
	}

	public void race() {
		ResultView.printStartMessage();
		for (int i = 0; i < lapCount; i++) {
			lap();
		}
		List<String> winners = this.cars.findWinners();
		ResultView.printWinners(winners);

	}

	private void lap() {
		for (Car car : this.cars.lap()) {
			ResultView.printLapScore(car.getCarName(), car.getPosition());
		}
		ResultView.printLapEnd();
	}

}
