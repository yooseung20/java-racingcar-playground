package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

import racinggame.utils.RandomNumber;

public class Cars {
	private final List<Car> cars;
	public Cars(List<Car> cars) {
		this.cars = cars;
	}

	public int size() {
		return this.cars.size();
	}

	public List<String> findWinners() {
		return findWinners(getMaxPosition());
	}

	private Position getMaxPosition() {
		Position maxPosition = new Position();

		for(Car car : this.cars) {
			maxPosition = car.getMaxPosition(maxPosition);
		}

		return maxPosition;
	}

	private List<String> findWinners(Position maxPosition){
		List<String> winners = new ArrayList<>();

		for(Car car : this.cars) {
			if(car.isWinner(maxPosition)){
				CarName carName = car.getCarName();
				winners.add(carName.getName());
			}
		}

		return winners;
	}

	public List<Car> lap() {
		for (Car car : this.cars) {
			car.move(RandomNumber.createUnits());
		}
		return this.cars;
	}
}
