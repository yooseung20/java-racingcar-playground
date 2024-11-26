import java.util.List;

import domain.Cars;

public class Application {
	public static void main(String[] args) {
		String carNames = InputView.requestNames();
		int count = InputView.requestCount();

		Cars cars = new Cars(carNames);
		start(cars,count);
	}

	private static void start(Cars cars, int count) {
		ResultView.ready();

		for(int i = 0; i < count; i++) {
			ResultView.printStatus(cars.race());
		}

		List<String> winners = cars.winners();
		ResultView.printWinner(winners);

	}
}
