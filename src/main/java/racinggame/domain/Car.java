package racinggame.domain;

public class Car {
	private static final int MIN_ACCELERATION = 4;
	private CarName name;
	private Position position;

	public Car(String name) {
		this.name = new CarName(name);
		this.position = new Position();
	}

	public Car(String name, int position) {
		this.name = new CarName(name);
		this.position = new Position(position);
	}

	public CarName getCarName() {
		return this.name;
	}

	public Position getPosition() {
		return this.position;
	}

	public void move(int acceleration) {
		if (acceleration >= MIN_ACCELERATION) {
			this.position.increase();
		}

	}

	public Position getMaxPosition(Position maxPosition) {
		if (this.position.isGraterThan(maxPosition)) {
			return this.position;
		}
		return maxPosition;
	}

	public boolean isWinner(Position maxPosition) {
		return this.position.equals(maxPosition);
	}

}
